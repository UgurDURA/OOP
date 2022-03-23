package Lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {


        ArrayList<Worker> workersArrayList = new ArrayList<>();


        Scanner sc=new Scanner(System.in);
        System.out.println("--->>>[PROGRAM STATUS]: Factory Management System is running.....");
        boolean programRun = true;
        while(programRun)
        {
            System.out.println("----------Welcome to the Factory Management System----------");
            System.out.println(">>>>>>>>Main Menu Options Page <<<<<<<<<<");
            System.out.println("MENU OPTIONS [1 through 3] : ");
            System.out.println("***       Press 1 to provide new worker information    ***");
            System.out.println("***       Press 2 to print information                 ***");
            System.out.println("***       Press 3 to terminate the program             ***");
            System.out.println("Your chose?  :");
            int userChoice = sc.nextInt();
            switch (userChoice)
            {
                case 1:

                    boolean workerinfoRun = true;

                    while(workerinfoRun)
                    {
                        System.out.println("Please provide the following information");
                        System.out.print("Worker ID: ");
                        int workerID = sc.nextInt();
                        System.out.print("Worker's Full Name: ");
                        String workerFullName = sc.next();
                        System.out.print("Worker's Montly Salary: ");
                        int workerMonthlySalary = sc.nextInt();
                        System.out.print("Job Description: ");
                        String workersJobDescription = sc.next();
                        System.out.println("Is master ? [true or false]");
                        boolean workerIsMaster = sc.nextBoolean();
                        Worker worker1 = new Worker(workerID,workerFullName,workerMonthlySalary,workersJobDescription,workerIsMaster);
                        workersArrayList.add(worker1);
                        System.out.println("--->>>>[PROGRAM STATUS]: New Worker Succesfully Added....");
                        System.out.println(">>>>>>>>Worker Info Adding Page<<<<<<<<<<");
                        System.out.println("MENU OPTIONS [1 through 3] :  ");
                        System.out.println("***       Press 1 to provide another new worker information    ***");
                        System.out.println("***       Press 2 to go back to the Main Menu                  ***");
                        System.out.println("***       Press 3 to terminate the program                     ***");
                        int userChoice1 = sc.nextInt();

                        switch (userChoice1)
                        {
                            case 1:
                                continue;
                            case 2:
                                workerinfoRun = false;
                                break;

                            case 3:
                                workerinfoRun = false;
                                System.out.println("Terminating worker add page....");
                                programRun = false;
                                System.out.println("Terminating the program....");
                                break;
                        }

                        break;

                    }
                    break;


                case 2:
                    displayArrayInfo(workersArrayList);
                    break;

                case 3:
                    programRun = false;
                    System.out.println("Program is terminating.....");
                    break;





            }
        }




    }

    public static void displayArrayInfo (ArrayList<Worker> workersArrayList)
    {
        Worker workerClass = new Worker();
        Worker[] workersArray = new Worker[workersArrayList.size()];
        workersArray = ArrayList2Array(workersArrayList);
        System.out.println(">>>>>>>>>>>>>>>> Patient Information Display Page<<<<<<<<<<<<<<");
        System.out.println("Currently Registered Number of Workers: "+workersArray.length);

        for(int i = 0;i<workersArray.length;i++)
        {
            System.out.println("----------------------------------------------------------");
            System.out.println("Worker ID: "+workersArray[i].getWorkerID());
            System.out.println("Full Name: "+workersArray[i].getFullName());
            System.out.println("Monthly Salary: "+workersArray[i].getMonthlySalary());
            System.out.println("Job Description: "+workersArray[i].getJobDescription());
            System.out.println("The annual Salary of the Worker is: "+workerClass.calculateAnnualIncome(workersArray[i].isMaster()));
            System.out.println("----------------------------------------------------------");

        }

    }


    public static Worker[] ArrayList2Array (ArrayList<Worker> workersArrayList)
    {

        Worker[] workersArray = new Worker[workersArrayList.size()];

        for(int i = 0;i<workersArray.length;i++)
        {
            workersArray[i] = workersArrayList.get(i);
        }

        return workersArray;





    }

}



