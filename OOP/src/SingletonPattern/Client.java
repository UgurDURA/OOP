package SingletonPattern;

public class Client
{
    public static void main(String[] args) {
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry1 = EagerRegistry.getInstance();

        LazyRegistryWithDCL lazysingleton1 = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazysingleton2 = LazyRegistryWithDCL.getInstance();

        System.out.println(registry==registry1);
        System.out.println(lazysingleton1==lazysingleton2);

        LazyRegistryIODH singleton;
        LazyRegistryIODH singleton2;
        LazyRegistryIODH singleton3;
        LazyRegistryIODH singleton4;
        LazyRegistryIODH singleton5;

        singleton = LazyRegistryIODH.getInstance();
        singleton2 = LazyRegistryIODH.getInstance();
        singleton3 = LazyRegistryIODH.getInstance();
        singleton4 = LazyRegistryIODH.getInstance();
        singleton5= LazyRegistryIODH.getInstance();

        System.out.println(singleton==singleton2);



    }
}
