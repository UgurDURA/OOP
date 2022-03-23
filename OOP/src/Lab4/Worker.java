package Lab4;

public class Worker
{
    private int workerID;
    private String fullName;
    private double monthlySalary;
    private String jobDescription;

    public Worker(int workerID, String workerFullName, int workerMonthlySalary, String workersJobDescription)
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
}
