package Lab5;

public class Car
{
    private int modelYear;
    private String model;
    private double topSpeed;
    private double price;

    Car()
    {

    }
    Car(int modelYear, String model, double topSpeed, double price)
    {
        setModelYear(modelYear);
        setModel(model);
        setTopSpeed(topSpeed);
        setPrice(price);
        printInfo();

    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void printInfo()
    {
        System.out.println("------------------------------------------------");
        System.out.println("Model Year: "+this.modelYear);
        System.out.println("Model: "+this.model);
        System.out.println("Top Speed: "+this.topSpeed);
        System.out.println("Price: "+this.price);
        System.out.println("------------------------------------------------");



    }
}
