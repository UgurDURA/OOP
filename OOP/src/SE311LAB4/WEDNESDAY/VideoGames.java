package SE311LAB4.WEDNESDAY;

public interface VideoGames
{


     void add();
     void remove();
     void Display();
     public String getname();
     public int getCount();
     public void find(String name);

}

class Composite implements VideoGames
{
    private String name;
    public int count;

    public Composite(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCount(int count)
    {
        this.count = count;
    }


    @Override
    public String getname() {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public void add()
    {

    }

    @Override
    public void remove() {

    }

    @Override
    public void Display() {

    }

    @Override
    public void find(String name) {

    }
}

class Leaf implements VideoGames
{
    String name;
    String company;
    public int year;
    public int count;


    @Override
    public String getname() {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void Display() {

    }

    @Override
    public void find(String name) {

    }
}

class Client
{
    public static void main(String[] args)
    {
        VideoGames root = new Composite("Video Games");

        VideoGames gameType1 = new Composite("Sandbox");
        VideoGames gameType2 = new Composite("Shooters FPS and TPS");

        VideoGames gameName = new Composite("Minecraft");
//        gameName.add(new Leaf());
//
//
//
//
//
//
//
//
//        companySandBox.add();

    }
}