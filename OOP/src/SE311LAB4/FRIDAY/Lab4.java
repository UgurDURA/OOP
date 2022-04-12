package SE311LAB4.FRIDAY;


import java.util.ArrayList;

interface GameRange
{
    void add(GameRange e);
    void remove(GameRange e);
    void display(int indent);
    public String getName();
    public int find(String name);
}

class Game implements GameRange {

    private String name;



    public String getName() { return name;}

    @Override
    public int find(String name) {
        return this.name == name ? 0 : -1 ;
    }

    public Game(String name) {this.name = name;}

    public void add (GameRange c) {

        System.out.println("Cannot add to a PrimitiveElement.");


    }
    public void remove (GameRange c) {
        System.out.println( "Cannot remove from a PrimitiveElement.");

    }

    public void display(int indent) {
        for (int i = 1; i <= indent; i++)
        {
            System.out.println(" - ");
            System.out.println(" " + name);
        }

    }
}

class GameFamily implements GameRange {
    private String name;
    private ArrayList<GameRange> elements = new ArrayList<GameRange>();

    public String getName() {
        return name;
    }

    public GameFamily(String name)
    {
        this.name = name;

    }

    public void add(GameRange e) {
        elements.add(e);
    }

    public void remove(GameRange e) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getName() == e.getName()) {
                elements.remove(i);
                return;
            }
        }
    }

    public void display(int indent) {
        for (int i = 1; i <= indent; i++) {
            System.out.println(" - ");
            System.out.println(" " + name);
        }

        for (int i = 0; i < elements.size(); i++) {
            elements.get(i).display(indent + 2);
        }


    }

    public int find(String name)
    {
        if (this.name == name) {
            return elements.size();
        }

        for (int i = 0; i < elements.size(); i++)
        {
            if (elements.get(i).find(name) >= 0)
            {
                return elements.get(i).find(name);
            }

        }


        return -1;
    }
}



public class Lab4
{
    public static void main(String[] args)
    {

        GameFamily SandBox = new GameFamily("SandBox");






    }
}
