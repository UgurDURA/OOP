package SE311LAB1;

import java.util.HashMap;

class Singleton
{
     static String name;

    private static int count=0;
    private static HashMap<String, Singleton> createdObject = new HashMap<>();


    private Singleton(String name)
    {
        this.name = name;

    }

    public static Singleton registerInstances(String name)
    {
        Singleton obj = null;

        if(count<3 )
        {
             obj = new Singleton(name);
            count++;
            createdObject.put(name,obj);

        }
        else
        {
            System.out.println("Object creation limit is exceeded");
        }
        return obj;
    }

    public static String getInstance(String name)
    {
        name = String.valueOf(createdObject.get(name));

        System.out.println(createdObject.size());

        return name;
    }


}