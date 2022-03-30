package SE311LAB2.WEDNESDAY;

public abstract class Parts
{
    protected String name;
    protected String feature;
    protected static int noOfParts;




    public void partInfo()
    {
        System.out.println("--------------------------");
        System.out.println(" Name: "+this.name);
        System.out.println(" Feature: "+this.feature);
        noOfParts++;
        System.out.println("--------------------------");


    }
}

class Engine extends Parts
{
    Engine(String name, String feature )
    {

        this.name=name;
        this.feature = feature;
        this.noOfParts = noOfParts;
    }


    @Override
    public void partInfo()
    {
        System.out.println("--------------------------");
        System.out.println("Engine Door Name: "+this.name);
        System.out.println("Engine Feature: "+this.feature);
        System.out.println("--------------------------");

    }
}


class Wheels extends Parts
{
    Wheels(String name, String feature )
    {

        this.name=name;
        this.feature = feature;
        this.noOfParts = noOfParts;
    }

    @Override
    public void partInfo()
    {
        System.out.println("--------------------------");
        System.out.println("Car wheel Name: "+this.name);
        System.out.println("Wheel Feature: "+this.feature);
        System.out.println("--------------------------");

    }
}

class CarDoors extends Parts
{
    CarDoors(String name, String feature )
    {

        this.name=name;
        this.feature = feature;
        this.noOfParts = noOfParts;
    }

    @Override
    public void partInfo()
    {
        System.out.println("--------------------------");
        System.out.println("Car Door Name: "+this.name);
        System.out.println("Door Feature: "+this.feature);
        System.out.println("--------------------------");

    }
}
