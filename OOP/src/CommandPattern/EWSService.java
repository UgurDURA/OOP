package CommandPattern;

//Receiver

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