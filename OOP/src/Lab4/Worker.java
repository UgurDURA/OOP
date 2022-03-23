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

    public double calculateAnnualIncome()
    {
        double annualSalary=0;
        double salary =  this.getMonthlySalary();
        if(this.isMaster == true)
        {

           double calculatedAnnualSalary = 12*salary;
           annualSalary = (calculatedAnnualSalary)+ ((20/100)*calculatedAnnualSalary);



        }
       if(isMaster == false)
       {
           double calculatedAnnualSalary = 12*salary;
           annualSalary = calculatedAnnualSalary;

       }
       return annualSalary;
    }
}


