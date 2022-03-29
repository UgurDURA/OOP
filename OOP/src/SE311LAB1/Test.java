package SE311LAB1;

public class Test
{
    public static void main(String[] args)
    {
         Singleton obj1 = Singleton.registerInstances("t1");
        Singleton obj2 = Singleton.registerInstances("t2");
        Singleton obj3 = Singleton.registerInstances("t3");
        Singleton obj4 = Singleton.registerInstances("t4");
        Singleton obj5 = Singleton.registerInstances("t5");

        System.out.println(Singleton.getInstance("t1"));
        System.out.println(Singleton.getInstance("t2"));
        System.out.println(Singleton.getInstance("t3"));
        System.out.println(Singleton.getInstance("t4"));
        System.out.println(Singleton.getInstance("t5 "));




    }
}
