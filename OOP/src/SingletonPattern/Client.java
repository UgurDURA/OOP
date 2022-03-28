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


    }
}
