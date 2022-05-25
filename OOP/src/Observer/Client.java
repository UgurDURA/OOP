package Observer;

import java.util.ArrayList;

interface Observable
{
    void my_add(Observer observer);
    void remove(Observer observer);
    void my_notify();

}

interface Observer
{
    void update();
}

class WeatherStation implements Observable
{
    ArrayList<Observer>observers = new ArrayList<Observer>();
    int temperature = 0;


    @Override
    public void my_add(Observer observer)
    {
        this.observers.add(observer);

    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void my_notify()
    {
        for (Observer observer: this.observers)
        {
            observer.update();

        }
    }

    public int getTempreature()
    {
        return this.temperature;
    }
}

class PhoneDisplay implements Observer
{
    WeatherStation station = new WeatherStation();

    public PhoneDisplay (WeatherStation station)
    {
        this.station = station;
    }

    @Override
    public void update()
    {
        System.out.println("Notification : "+ this.station.getTempreature());


    }
}

public class Client
{
    static WeatherStation station = new WeatherStation();
    static PhoneDisplay display = new PhoneDisplay(station);
    public static void main(String[] args) {

         update();

    }

    public static synchronized void update()
    {
        station.my_add(display);
        station.notify();


    }
}
