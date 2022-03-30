package SE311LAB1.FRIDAY;

import SE311LAB1.FRIDAY.Singleton;

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {

        ArrayList<String> names = new ArrayList<>();

        names.add("A");
        names.add("B");
        names.add("B");
        names.add("C");
        names.add("D");
        names.add("E");

        Singleton.registerInstance(names);
        System.out.println(Singleton.getInstance("A"));
        System.out.println(Singleton.getInstance("B"));
        System.out.println(Singleton.getInstance("C"));
        System.out.println(Singleton.getInstance("D"));
        System.out.println(Singleton.getInstance("E"));
        System.out.println(Singleton.getInstance("A"));

//         Singleton obj1 = Singleton.registerInstances("t1");
//        Singleton obj2 = Singleton.registerInstances("t2");
//        Singleton obj3 = Singleton.registerInstances("t3");
//        Singleton obj4 = Singleton.registerInstances("t4");
//        Singleton obj5 = Singleton.registerInstances("t5");
//
//        System.out.println(Singleton.getInstance("t1"));
//        System.out.println(Singleton.getInstance("t2"));
//        System.out.println(Singleton.getInstance("t3"));
//        System.out.println(Singleton.getInstance("t4"));
//        System.out.println(Singleton.getInstance("t5 "));







    }
}
