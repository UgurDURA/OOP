package Lab3;

import java.util.Scanner;

public class Test
{


    public static void main(String[] args)
    {
        Patient[] patientlist = new Patient[5];
        Patient patient = new Patient();


        Patient patint1 = new Patient(001,"Patient 1",18,"Cancer");
        Patient patint2 = new Patient(002,"Patient 2",28,"Cancer 2");
        Patient patint3 = new Patient(003,"Patient 3",48,"Cancer 3");
        Patient patint4 = new Patient(004,"Patient 4",38,"Cancer 4");
        Patient patint5 = new Patient(005,"Patient 5",20,"Cancer 5");


        Scanner sc=new Scanner(System.in);
        System.out.println("A sample of hospital information system is running now.....");

        Boolean programRun = true;
        while(programRun)
        {
            displayMenu();
            System.out.println("Your chose?  :");
            int userChoice = sc.nextInt();
            switch (userChoice)
            {
                case 1:

                    if(patientlist[4] != null)
                    {
                        System.out.println("Array is full");
                    }
                    else
                    {
                         storePatient(patientlist, patint1,0);
                        storePatient(patientlist, patint2,1);
                        storePatient(patientlist, patint3,2);
                        storePatient(patientlist, patint4,3);
                        storePatient(patientlist, patint5,4);

                        System.out.println("------------------------------------------------");
                        System.out.println("---->>>> [PPOGRAM STATUS] Patients are added succesfully");
                        System.out.println("------------------------------------------------");

                    }
                    break;



                case 2:
                    patient.printInfo(patientlist);
                    break;


                case 3:
                    programRun=false;
                    System.out.println("------------------------------------------------");
                    System.out.println("---->>>> [PPOGRAM STATUS] Program terminated Succesfully");
                    System.out.println("------------------------------------------------");


            }
        }


    }

    public static void displayMenu()
    {
        System.out.println("MENU OPTIONS [1 through 3] : ");
        System.out.println("***   Press 1 to store information       ***");
        System.out.println("***   Press 2 to print information       ***");
        System.out.println("***   Press 3 to terminate the program   ***");
    }

    public static void storePatient(Patient arraylist[], Patient patientReference, int index)
    {
        Patient[] arraylist1 = arraylist;

        arraylist1[index] = patientReference;


    }

    public static void printArray()
    {

    }
}

