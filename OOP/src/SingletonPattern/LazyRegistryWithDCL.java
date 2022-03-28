package SingletonPattern;

public class LazyRegistryWithDCL
{
    private LazyRegistryWithDCL()
    {

    }

    private static volatile LazyRegistryWithDCL INSTANCE;

    public static  LazyRegistryWithDCL getInstance()
    {
        if(INSTANCE==null)
        {
            synchronized (LazyRegistryWithDCL.class)
            {
                if(INSTANCE==null)
                {
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }

}
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