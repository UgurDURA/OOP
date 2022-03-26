package Lab5;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        final int arraySize = 2;
        Car[] carArray = new Car[arraySize];
        Car car = new Car();
        Scanner sc=new Scanner(System.in);

        for (int i =0; arraySize>i;i++)
        {
            System.out.println(">>>Please provide the following information for the Car: ");
            System.out.println("Model Year : ");
            int carModelYear = sc.nextInt();
            System.out.println("Model Name: ");
            String carModelName = sc.next();
            System.out.println("Top Speed: ");
            int carTopSpeed = sc.nextInt();
            System.out.println("Price : ");
            int carPrice = sc.nextInt();
            System.out.println(">>>Please provide the Engine Informations");
            System.out.println("Volume: ");
            int engineVolume = sc.nextInt();
            System.out.println("Number of cylinders: ");
            int engineCylinderNumber = sc.nextInt();
            Engine engineObject = new Engine(engineVolume,engineCylinderNumber);
            Car carObject = new Car(carModelYear,carModelName,carTopSpeed,carPrice,engineObject);

            carArray[i] = carObject;


        }

        car.printInfo();














    }

}
