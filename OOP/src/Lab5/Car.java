package Lab5;

public class Car
{
    private int modelYear;
    private String model;
    private double topSpeed;
    private double price;
    private Engine eng;
    private static int carCounter = 0;

    public static int getCarCounter() {
        return carCounter;
    }

    public static void setCarCounter(int carCounter) {
        Car.carCounter = carCounter;
    }

    public Engine getEng()
    {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }

    Car()
    {
        System.out.println(getClass().getName()+" Object is created ");

    }
    Car(int modelYear, String model, double topSpeed, double price, Engine engine)
    {
        carCounter++;
        setModelYear(modelYear);
        setModel(model);
        setTopSpeed(topSpeed);
        setPrice(price);
        setEng(engine);

        System.out.println(getClass().getName()+" Object is created " );
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
        System.out.println("The Engine information of the Car ");
        System.out.println("Engine Volume: "+eng.getVolueme());
        System.out.println("Engine Cylinder : "+eng.getNumberofClinders());
        System.out.println("Total Number of Cars: "+getCarCounter());
        System.out.println("------------------------------------------------");



    }
}

 class Engine extends Car
{
    private int volueme;
    private  int numberofClinders;

    Engine(int volume, int numberofClinders)
    {
        setVolume(volume);
        setNumberofClinders(numberofClinders);
        System.out.println(getClass().getName()+" Object is created ");

    }

    public int getVolueme() {
        return volueme;
    }

    public void setVolume(int volueme) {
        this.volueme = volueme;
    }

    public int getNumberofClinders() {
        return numberofClinders;
    }

    public void setNumberofClinders(int numberofClinders) {
        this.numberofClinders = numberofClinders;
    }
}
