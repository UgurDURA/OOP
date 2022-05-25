package Observer.Trial2;


import java.util.ArrayList;
import java.util.List;

interface DistributionCenter
{
    PizzaRestaurant PIZZA_RESTAURANT = null;
    void update();
}
interface Restaurant
{
    void attach(DistributionCenter observer);
    void setState(boolean State);
    void notifyAllObservers();

}
public class PizzaRestaurant implements Restaurant
{
    private Boolean RequirePizzaSupply = false;
    private List<DistributionCenter> observers = new ArrayList<DistributionCenter>();
    int numberofPizzas;
    String restaurantName;

    public PizzaRestaurant(String restaurantName, int numberofPizzas)
    {
        this.restaurantName = restaurantName;
        this.numberofPizzas = numberofPizzas;

    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }


    public int getNumberofPizzas() {
        return numberofPizzas;
    }

    public void setNumberofPizzas(int numberofPizzas) {
        this.numberofPizzas = numberofPizzas;
    }

    @Override
    public void attach(DistributionCenter observer)
    {
        observers.add(observer);

    }

    @Override
    public void setState(boolean state)
    {
        this.RequirePizzaSupply = state;
        notifyAllObservers();
    }

    public void notifyAllObservers()
    {
        for(DistributionCenter observer : observers)
        {
            observer.update();
        }
    }

    public Boolean getState()
    {
        return RequirePizzaSupply;
    }
}

class PizzaDistributionCenter implements DistributionCenter
{
    PizzaRestaurant pizzaRestaurant;

    public PizzaDistributionCenter(PizzaRestaurant pizzaRestaurant)
    {
         this.pizzaRestaurant = pizzaRestaurant;
         this.pizzaRestaurant.attach(this);
    }

    @Override
    public void update()
    {
        System.out.println("Pizza Distribution Center is notified : Restaurant Requires pizza");
    }
}

class ObserverPattern
{
    public static void main(String[] args)
    {
        int threshold = 2500;

        PizzaRestaurant pizzaRestaurant_A = new PizzaRestaurant("A",2000);


        new PizzaDistributionCenter(pizzaRestaurant_A);


        if(pizzaRestaurant_A.getNumberofPizzas() < threshold)
            pizzaRestaurant_A.setState(true);




    }
}
