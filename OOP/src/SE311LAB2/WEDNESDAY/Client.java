package SE311LAB2.WEDNESDAY;

public class Client
{
    public static void main(String[] args)
    {
         Parts engine1 = new Engine("Engine name 1","Engine Feature" );
         Parts wheels1 = new Wheels("Wheels name","Wheels Feature" );
         Parts cardoors1 = new CarDoors("Door name","Door feature" );


        System.out.println(engine1);
        System.out.println(wheels1);
        System.out.println(cardoors1);

         Car car = new Car();

          car.addParts(engine1);
          car.addParts(wheels1);
          car.addParts(cardoors1);

         car.showModelInfo();




    }
}
