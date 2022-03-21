package Lab3;

public class Patient
{
    private int patientID;
    private String fullName;
    private int age;
    private String diagnosis;

    Patient()
    {

    }

    public Patient(int patientID, String fullName, int age, String diagnosis) {
        this.patientID = patientID;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void printInfo(Patient[] object)
    {
        for (int i=0;i<object.length;i++)
        {
            System.out.println("------------------------------------------------");
            System.out.println("Patient ID : "+object[i].patientID);
            System.out.println("Patient Full Name: "+object[i].fullName);
            System.out.println("Patient Age: "+object[i].age);
            System.out.println("Patient's Diagnosis: "+object[i].diagnosis);
            System.out.println("------------------------------------------------");
        }

    }




}
