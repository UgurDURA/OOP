package SE311LAB6.FRIDAY;

import java.util.ArrayList;

abstract class Product {
    abstract public String displayName();
    abstract double getPrice();
}

abstract class Console extends Product {
    protected double price;
    protected String name;
    public double getPrice(){ return price; }
    public String displayName() { return name; }
}

class Sony_Console extends Console
{
    public Sony_Console (double p) {
        price = p;
        name = new String("Sony PS5 Console");
        System.out.println("PS5 Console is created...");
    }
}

class Nintendo_Console extends Console
{
    public Nintendo_Console(double p)
    {
        price = p;
        name = new String("Nintendo Switch Console");
        System.out.println("Switch Console is created...");
    }
}

class Microsoft_Console extends Console
{
    public Microsoft_Console(double p)
    {
        price = p;
        name = new String("Microsoft XboxOne Console");
        System.out.println("Microsoft XboxOne Console is created...");
    }
}

abstract class JoyPad extends Product {
    protected double price;
    protected String name;
    public double getPrice(){ return price; }
    public String displayName() { return name; }
}

class Sony_JoyPad extends JoyPad
{
    public Sony_JoyPad(double p)
    {
        price = p;
        name = new String("Sony PS5 Controller");
        System.out.println("PS5 Controller JoyPad is created...");

    }
}

class Nintendo_JoyPad extends JoyPad
{
    public Nintendo_JoyPad(double p)
    {
        price = p;
        name = new String("Nintendo JoyCon");
        System.out.println(" Nintendo JoyCon JoyPad is created...");

    }

}
class Microsoft_JoyPad extends JoyPad
{
    public Microsoft_JoyPad(double p)
    {
        price = p;
        name = new String("Microsoft Xbox controller");
        System.out.println(" Microsoft Xbox  is created...");

    }

}

abstract class GameFactory
{
    abstract public Console createConsole();
    abstract public JoyPad  createJoyPad();

}

class SonyFactory extends GameFactory
{

    @Override
    public Console createConsole() {
        return new Sony_Console(3500.50);
    }

    @Override
    public JoyPad createJoyPad() {
        return new Sony_JoyPad(500.45);
    }
}

class NintendoFactory extends GameFactory
{

    @Override
    public Console createConsole() {
        return new Nintendo_Console(4000.30);
    }

    @Override
    public JoyPad createJoyPad() {
        return new Nintendo_JoyPad(300);
    }
}

class MicrosoftFactory extends GameFactory
{

    @Override
    public Console createConsole() {
        return new Microsoft_Console(6000);
    }

    @Override
    public JoyPad createJoyPad() {
        return new Microsoft_JoyPad(2000);
    }
}

class BuildBundle
{
    private ArrayList<Product> parts;
    public void createBundle(GameFactory factory) {
        parts = new ArrayList<Product>();
        parts.add(factory.createConsole());
        parts.add(factory.createJoyPad());
    }
    void displayParts() {
        System.out.println("\tListing Parts\n\t-------------");
        parts.forEach(p  -> System.out.println("\t"+ p.displayName() +
                " " + p.getPrice()));
    }
    void displayTotal(){
        double total = parts.stream().mapToDouble(Product::getPrice).sum();
        System.out.println("\t"+ "Total Bundle Cost: " + total);
    }

}




public class Client
{
    public static void main(String[] args) {

        GameFactory Sony = new SonyFactory();
        GameFactory Nintendo = new NintendoFactory();
        GameFactory Microsoft = new MicrosoftFactory();


        BuildBundle bundle = new BuildBundle();
        System.out.println("\nCreating Sony");
        bundle.createBundle(Sony);
        bundle.displayParts();
        bundle.displayTotal();

        System.out.println("\nCreating Nintendo");
        bundle.createBundle(Nintendo);
        bundle.displayParts();
        bundle.displayTotal();

        System.out.println("\nCreating Microsoft");
        bundle.createBundle(Microsoft);
        bundle.displayParts();
        bundle.displayTotal();

    }

}