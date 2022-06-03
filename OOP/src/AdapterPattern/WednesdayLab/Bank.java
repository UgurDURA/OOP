package AdapterPattern.WednesdayLab;

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

public class Bank{
    public static void main(String [] args){
        Customer c1 = new Customer("Erdem Okur", 12345);
        IBank b1 = new Bank_A();

        b1.addCustomer(c1,9000);

        System.out.println("Initial Limits:");
        System.out.println(b1.learnLimit(12345));

        b1.raiseLimit(12345,17000);

        System.out.println("Edited Limits:");
        System.out.println(b1.learnLimit(12345));

    }
}


