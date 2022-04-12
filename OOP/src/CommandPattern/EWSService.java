package CommandPattern;

//Receiver

import java.util.LinkedList;
import java.util.List;

public class EWSService
{
    public void addMember (String contact, String concactGroup)
    {
        System.out.println("Added "+contact+ " to "+concactGroup);
    }
    public void removeMember(String contact, String concactGroup)
    {
        System.out.println("Removed "+contact+ " from "+concactGroup);

    }
}

//Interface implemented by all concrete command classes

interface Command
{
    void execute();
}


//Concrete implementation of Command

class AddMemberCommand implements Command
{
    private String emailAddress;
    private String listName;

    private EWSService receiver;

    public AddMemberCommand(String email, String listName, EWSService service)
    {
        this.emailAddress = email;
        this.listName = listName;
        this.receiver = service;
    }


    @Override
    public void execute()
    {
        receiver.addMember(emailAddress, listName);

    }
}

//Invoker which executes commands
//starts a worker thread in charge of executing commands

class MailTaskRunner implements Runnable
{
    public Thread runner;
    private List<Command> pendingCommands;
    private volatile boolean stop;
    private static final MailTaskRunner RUNNER = new MailTaskRunner();

    public static final MailTaskRunner getInstance()
    {
        return RUNNER;
    }

    private MailTaskRunner()
    {
        pendingCommands = new LinkedList<>();
        runner = new Thread(this);
        runner.start();
    }
    @Override
    public void run()
    {
         while (true)
         {
             Command cmd = null;
             synchronized (pendingCommands)
             {
                 if (pendingCommands.isEmpty())
                 {
                     try
                     {
                         pendingCommands.wait();

                     } catch (Exception e) {
                         System.out.println("Runner interrupted");
                         if (stop)
                         {
                             System.out.println("Runner Stoping");
                             return;
                         }
                     }

                 }
                 else
                 {
                     cmd = pendingCommands.remove(0);
                 }
             }
             if (cmd == null)
             {
                 return;
             }
             cmd.execute();
         }

    }

    public void addCommand (Command cmd)
    {
        synchronized (pendingCommands)
        {
            pendingCommands.add(cmd);
            pendingCommands.notifyAll();
        }
    }

    public void shutdown()
    {
        this.stop = true;
        this.runner.interrupt();
    }


}