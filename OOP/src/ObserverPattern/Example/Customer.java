package ObserverPattern.Example;

import java.util.ArrayList;

interface Subject
{


    void attach(Customer customer);

    void detach(Customer customer);

    void _notify();
}

interface Observer
{

    void update(Store store);
}


// Concrete Subject
class Store implements Subject
{
    ArrayList<Customer> customers = new ArrayList<>();

    String productName;
    int productPrice;

    public Store(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }


    @Override
    public void attach(Customer customer)
    {
        customers.add(customer);
        System.out.println(customer.customerName + "  is subscribed the store");
    }

    @Override
    public void detach(Customer customer)
    {
        customers.remove(customer);
        System.out.println(customer.customerName + "  is removed from subscription the store");

    }

    @Override
    public void _notify()
    {
        for (int i = 0; i<customers.size();i++)
        {
            customers.get(i).update(this);
        }

    }

    public void addProduct(String productName, int productPrice)
    {
        this.productName = productName;
        this.productPrice = productPrice;
        _notify();
    }

}


//concrete Observer
public class Customer implements Observer
{
    String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(Store store)
    {
        String _productName = store.productName;
        int _productPrice = store.productPrice;

        System.out.println("[NOTIFIED] : "+this.customerName+ " ----->>>>New Product is added, the product name is : "+ _productName +
            " with price " + _productPrice);

    }
}

class Test
{
    public static void main(String[] args)
    {
        Customer customer1 = new Customer("A");
        Customer customer2 = new Customer("B");
        Customer customer3 = new Customer("C");
        Customer customer4 = new Customer("D");
        Store store1 = new Store("Apple",10000);


        store1.attach(customer1);
        store1.attach(customer2);
        store1.attach(customer3);
        store1.attach(customer4);

        store1.addProduct("Samsung",500);

        store1.detach(customer3);

        store1.addProduct("Huawei",300);









    }
}




