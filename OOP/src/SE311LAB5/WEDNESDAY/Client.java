package SE311LAB5.WEDNESDAY;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

// Command Interface
interface Command
{
    public void Execute();
}

//Concrete Commands for Excel

class ExcelCopy  implements Command{

    private ExcelFile executer;

    public ExcelCopy(ExcelFile executer)
    {
        this.executer = executer;

    }

    @Override
    public void Execute()
    {
        executer.Action(1);
    }


    class ExcelPaste implements Command
    {

        @Override
        public void Execute()
        {
            executer.Action(2);

        }
    }
}

class WordCopy implements Command
{

    private WordFile executer;

    public WordCopy(WordFile executer)
    {
        this.executer = executer;
    }

    @Override
    public void Execute()
    {
        executer.Action(1);
    }
}

class WordPaste implements Command
{
    private WordFile executer;

    public WordPaste(WordFile executer)
    {
        this.executer = executer;
    }

    @Override
    public void Execute()
    {
        executer.Action(2);

    }
}



// Receivers (WordFile and ExcelFile)

class WordFile
{
    private String text;

    public WordFile()
    {
        text = null;
    }
    public void Action(int options)
    {
        switch (options) {
            case 1: //Copy
                text = "AAA";
                break;
            case 2: //Paste
                System.out.println("Pasting: " +text);
                break;
            case 3: //Copy and Paste
                Action(1);
                Action(2);
                break;

        }
    }


}

class ExcelFile
{
    private String text;

    public ExcelFile()
    {
        this.text = null;
    }

    public void Action(int options)
    {
        switch (options)
        {
            case 1:
                text = "SE311";
                break;
            case 2:
                System.out.println("Pasting :"+text);
                break;
            case 3: //Copy and Paste both
                Action(1);
                Action(2);
                break;
        }

    }
}

class Framework {
    Command command = null;
    MenuItem mi = new MenuItem();
    ExcelFile ef = new ExcelFile();
    WordFile wf = new WordFile();

    void create(String extension, int Op) {

        if (Objects.equals(extension, "xls")) {
            switch (Op) {
                case 1:
                    command = new ExcelCopy(ef);
                    mi.getUserToClick(command);
                    break;
//                case 2:
//                    command = new ExcelPaste(ef);
//                    mi.getUserToClick(command);
//                    break;
//                case 3:
//                    command = new ExcelCopyPaste(ef);
//                    mi.getUserToClick(command);
//                    break;
                default:
                    break;
            }
        } else if (Objects.equals(extension, "doc")) {
            switch (Op) {
                case 1:
                    command = new WordCopy(wf);
                    mi.getUserToClick(command);
                    break;
                case 2:
                    command = new WordPaste(wf);
                    mi.getUserToClick(command);
                    break;
//                case 3:
//                    command = new WordCopyPaste(wf);
//                    mi.getUserToClick(command);
//                    break;
                default:
                    break;
            }
        }
    }
}

//Invoker (MenuItem)

class MenuItem
{
    private ArrayList<Command> commands = new ArrayList<Command>();

    public MenuItem()
    {


    }

    void getUserToClick(Command command) {
        command.Execute();
        commands.add(command);
    }

}




public class Client
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Framework fw = new Framework();
        boolean a = true;
        while(true) {
            System.out.println("Enter xls for Excel\nEnter doc for Word");
            String extension = in.next();
            if(Objects.equals(extension, "doc")) {}
            else if(Objects.equals(extension, "xls")){}
            else{break;}
            System.out.println("\nEnter 1 for Copy\nEnter 2 for Paste\nEnter 3 for Copy and Paste");
            int op = in.nextInt();
            fw.create(extension, op);

        }
    }
}
