package Lab6;

import java.util.ArrayList;

public class Student
{
    private int ID;
    private String fullName;
    private double grade;

    Student()
    {

    }
    Student(int ID, String fullName, double grade)
    {
        setID(ID);
        setFullName(fullName);
        setGrade(grade);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void printinfo(Student object)
    {
        System.out.println("----------------------------");
        System.out.println("ID: "+object.getID());
        System.out.println("Full Name"+object.getFullName());
        System.out.println("Grade : "+object.getGrade());
        System.out.println("----------------------------");

    }
}
class Lecture
{
    private int lectureID;
    private  String lectureName;
    private ArrayList<Student> studentlist = new ArrayList<>();

    Lecture()
    {

    }
    Lecture(int lectureID, String lectureName, Student studentObject)
    {


    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public ArrayList<Student> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<Student> studentlist) {
        this.studentlist = studentlist;
    }
    public void printLectureInfo(Lecture object)
    {
        System.out.println("----------------------------");
        System.out.println("Lecture ID: "+object.getLectureID());
        System.out.println("Lecture Name: "+object.getLectureName());
        System.out.println("Registered Student ID's"+object.getStudentlist());


    }
}
class Test
{
    public static void main(String[] args)
    {



    }
}
