package Lab3;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Patient[] patientlist = new Patient[5];
        Patient patient = new Patient();

        Patient patine1 = new Patient(001,"Patient 1",18,"Cancer");
        Patient patine2 = new Patient(002,"Patient 2",28,"Cancer 2");
        Patient patine3 = new Patient(003,"Patient 3",48,"Cancer 3");
        Patient patine4 = new Patient(004,"Patient 4",38,"Cancer 4");
        Patient patine5 = new Patient(005,"Patient 5",20,"Cancer 5");


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
                        patientlist[0] = patine1;
                        patientlist[1] = patine2;
                        patientlist[2] = patine3;
                        patientlist[3] = patine4;
                        patientlist[4] = patine5;
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
}

