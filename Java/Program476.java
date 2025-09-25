/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program476.java
//
//  Description : Demonstrates creating a StudyLog class to maintain study
//                records. Each record stores subject, duration, and a
//                description of the topic studied. The program creates
//                multiple StudyLog objects and prints their references.
//
//  Note        : Here we are printing objects directly (sobj1, sobj2, sobj3),
//                which will display the default toString() reference.
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StudyLog
{
    public String Subject;
    public double Duration;
    public String Description;

    public StudyLog(String A, double B, String C)
    {
        this.Subject = A;
        this.Duration = B;
        this.Description = C;
    }

    public void Display()
    {
        System.out.println(Subject + " | " + Duration + " | " + Description);
    }
}

public class Program476
{
    public static void main(String A[])
    {
        StudyLog sobj1 = new StudyLog("C", 2.5, "Pointer and Array");
        StudyLog sobj2 = new StudyLog("C++", 2, "Polymorphism");
        StudyLog sobj3 = new StudyLog("Java", 3.5, "Inheritance");
        
        System.out.println(sobj1);
        System.out.println(sobj2);
        System.out.println(sobj3);
    }
}
