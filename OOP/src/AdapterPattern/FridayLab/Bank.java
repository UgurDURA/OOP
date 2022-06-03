package AdapterPattern.FridayLab;

import java.util.HashMap;
import java.util.Map;

class Customer{
    private String fullname;
    private int TC;

    public Customer(String fN, int tc){
        fullname = fN;
        TC = tc;
    }

    public String getFullname() {
        return fullname;
    }

    public int getTC() {
        return TC;
    }
}

interface IBank{
    void addCustomer(Customer c, int limit);
    int learnLimit(int tc);
    void raiseLimit(int tc, int newLimit);
}

class Bank_A implements IBank{
    private HashMap<Customer, Integer> customers = new HashMap<>();

    public void addCustomer(Customer c, int limit){
        customers.put(c,limit);
    }

    public int learnLimit(int tc){
        for (Map.Entry<Customer, Integer> tuple : customers.entrySet()) {
            if(tuple.getKey().getTC() == tc){
                return tuple.getValue();
            }
        }
        return -1;
    }

    public void raiseLimit(int tc, int newLimit){
        for (Map.Entry<Customer, Integer> tuple : customers.entrySet()) {
            if(tuple.getKey().getTC() == tc) {
                if (newLimit > tuple.getValue() && tuple.getValue() < 10000) {
                    tuple.setValue(newLimit);
                    System.out.println("Bank A: Customer " + tc + " your, limit is increased to " + newLimit + ".");
                } else if (newLimit > tuple.getValue() && newLimit < 10000) {
                    tuple.setValue(newLimit);
                    System.out.println("Bank A: Customer " + tc + " your, limit is increased to " + newLimit + ".");
                } else {
                    System.out.println("Bank A: We cannot increase your limit " + tc + ".");
                }
                return;
            }
        }
        System.out.println("Bank A: No customer with TCKNO: " + tc + ".");
    }

}

class Adapter implements IBank {
    New_Bank_A new_bank_a = new New_Bank_A();

    @Override
    public void addCustomer(Customer c, int limit) {
        new_bank_a.newCustomer(c, limit);
    }

    @Override
    public int learnLimit(int tc) {

        for (Map.Entry<Customer, Integer> tuple : new_bank_a.customers.entrySet()) {
            if (tuple.getKey().getTC() == tc) {
                tuple.getValue();
            }
        }
        return -1;
    }

    @Override
    public void raiseLimit(int tc, int newLimit) {
        String customerName = null;

        for (Map.Entry<Customer, Integer> tuple : new_bank_a.customers.entrySet()) {
            if (tuple.getKey().getTC() == tc) {
                customerName = tuple.getKey().getFullname();
                break;
            }

            new_bank_a.changeLimit(customerName, newLimit);
        }


    }
}

public class Bank{
    public static void main(String [] args){
//        Customer c1 = new Customer("Erdem Okur", 12345);
//        IBank b1 = new Bank_A();
//
//        b1.addCustomer(c1,9000);
//
//        System.out.println("Initial Limits:");
//        System.out.println(b1.learnLimit(12345));
//
//        b1.raiseLimit(12345,17000);
//
//        System.out.println("Edited Limits:");
//        System.out.println(b1.learnLimit(12345));

        Customer customer1 = new Customer("Ugur Dura",111222);
        IBank bank1 = new Adapter();

        System.out.println("Customer Added");

        bank1.addCustomer(customer1,5000);

        System.out.println("Initial limit of "+ customer1.getFullname()+ "is "+ bank1.learnLimit(customer1.getTC()));

        bank1.raiseLimit(customer1.getTC(), 100000);

        System.out.println("Edited Limites : Customer "+customer1.getFullname()+" limit is changed into "+bank1.learnLimit(customer1.getTC()));

    }
}



