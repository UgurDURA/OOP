package Lab4;

public class Worker
{
    private int workerID;
    private String fullName;
    private double monthlySalary;
    private String jobDescription;
    private boolean isMaster;

    public Worker()
    {

    }

    public boolean isMaster() {
        return isMaster;
    }

    public void setMaster(boolean master) {
        isMaster = master;
    }

    public Worker(int workerID, String workerFullName, int workerMonthlySalary, String workersJobDescription, boolean workerIsMaster)
    {
        this.workerID = workerID;
        this.fullName = workerFullName;
        this.monthlySalary = workerMonthlySalary;
        this.jobDescription = workersJobDescription;

    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public double calculateAnnualIncome(boolean isMaster)
    {
        if(isMaster == true)
        {
           double salary =  this.getMonthlySalary();
           double annualSalary = 12*salary;
           return (annualSalary + (20/100)*annualSalary);
        }
       if(isMaster == false)
       {
           double salary =  this.getMonthlySalary();
           double annualSalary = 12*salary;
           return annualSalary;
       }

        return 0;
    }
}


