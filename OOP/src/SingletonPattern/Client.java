package SingletonPattern;

public class Client
{
    public static void main(String[] args) {
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry1 = EagerRegistry.getInstance();

        System.out.println(registry==registry1);


    }
}
