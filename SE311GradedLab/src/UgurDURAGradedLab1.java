//Abstract Command Classes

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

interface Upper
{
    public void upper();
    public void display();
}
interface Clear
{
    public void clear();
    public void display();
}
interface Reverse
{
    public void reverse();
    public void display();

}


//Concrete Command classes

class UpperCommand implements Upper
{
    private String userInput;
    UpperCase upperCase = new UpperCase(userInput);


    public UpperCommand(String input)
    {
        this.userInput = input;

    }

    @Override
    public void upper()
    {
        upperCase.action();

    }

    @Override
    public void display()
    {

    }
}

class ClearCommand implements Clear
{
    private String userInput;
    private String manipulatedString;

    public ClearCommand(String input)
    {
        this.userInput = input;

    }

    @Override
    public void clear()
    {
        manipulatedString = userInput.toUpperCase(Locale.ROOT);
    }

    @Override
    public void display()
    {
        System.out.println(manipulatedString);
    }
}

class ReverseCommand implements Reverse
{
    private String userInput;
    private String manipulatedString;

    public ReverseCommand(String input)
    {
        this.userInput = input;

    }

    @Override
    public void reverse()
    {
        manipulatedString = userInput.toUpperCase(Locale.ROOT);
    }

    @Override
    public void display()
    {
        System.out.println(manipulatedString);
    }
}

//Receiver classes

class UpperCase
{
    private String userInput;
    private String manipulatedString;

    public UpperCase(String userInput)
    {
        this.userInput = userInput;
    }

    public void action()
    {
        manipulatedString = userInput.toUpperCase(Locale.ROOT);
    }

}

class ClearSpaces
{
    private String userInput;
    private String manipulatedString;

    public ClearSpaces(String userInput)
    {
        this.userInput = userInput;
    }

    public void action()
    {

    }

}

class ReverseString
{
    private String userInput;
    private String manipulatedString;

    public ReverseString(String userInput)
    {
        this.userInput = userInput;
    }

    public void action()
    {

    }
}

class  Manipulator
{

}


// Invoker

class MenuItem
{

    private ArrayList<Upper> upperCommands = new ArrayList<Upper>();
    private ArrayList<Clear> clearCommands = new ArrayList<Clear>();
    private ArrayList<Reverse> reverseCommands = new ArrayList<Reverse>();

    int option;

    public MenuItem()
    {
        this.option = option;

    }




}

class FrameWork
{
    MenuItem menuItem = new MenuItem();

    void manipulate(int useroption )
    {
        switch (useroption)
        {
            case 1:

                break;
            case 2:
                break;

        }
    }


}





public class Client
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        FrameWork framework = new FrameWork();
        int option;

        while(true)
        {
            System.out.println("--------------------------------------------------------------");
            System.out.println("***              Welcome to the Text Manipulator         ***");
            System.out.println("***      Please Choice options below [Type : 1,2,3 or 4  ***");
            System.out.println("***      [OPTION 1] : Upper Case                         ***");
            System.out.println("         [OPTION 2] : Clear the spaces                   ***");
            System.out.println("         [OPTION 3] :  Reverse the text                  ***");
            System.out.println("         [OPTION 4] :  Terminate the program             ***");
            System.out.println("--------------------------------------------------------------");

            option = scanner.nextInt();

            framework.manipulate(option);

        }

    }
}
