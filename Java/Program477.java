/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program477.java
//
//  Description : Demonstrates creating a StudyLog class with subject, duration,
//                and description. Overrides the toString() method to show a
//                custom message. The program creates multiple StudyLog objects
//                and prints them.
//
//  Note        : Printing objects directly calls the overridden toString() method.
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
    public String Descrption;

    public StudyLog(String A, double B, String C)
    {
        this.Subject = A;
        this.Duration = B;
        this.Descrption = C;
    }

    public void Display()
    {
        System.out.println(Subject + " | " + Duration + " | " + Descrption);
    }

    public String toString()
    {
        return "Inside Tostring";
    }
}

public class Program477
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
