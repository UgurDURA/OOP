package Introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] numbers = new int[5];

        String[] names = new String[5];


        Student[] students = new Student[5];

        Student ugur = new Student();
        ugur.rno = 14;
        System.out.println(ugur.rno);

    }


}

class Student
{
    int rno = 10;
    String  name;
    float marks;

    Student()
    {

    }

    Student (int rno, String name, float marks)
    {
        this.rno = rno;
        this.name = name;
        this.marks = marks;

    }



}