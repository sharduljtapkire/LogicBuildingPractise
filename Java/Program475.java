/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program475.java
//
//  Description : Demonstrates creating a StudyLog class to maintain study
//                records. Each record stores subject, duration, and a
//                description of the topic studied. The program creates
//                multiple StudyLog objects and displays their details.
//
//  Example     :
//                Output:
//                C | 2.5 | Pointer and Array
//                C++ | 2.0 | Polymorphism
//                Java | 3.5 | Inheritance
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

public class Program475
{
    public static void main(String A[])
    {
        // Create study log objects
        StudyLog sobj1 = new StudyLog("C", 2.5, "Pointer and Array");
        StudyLog sobj2 = new StudyLog("C++", 2, "Polymorphism");
        StudyLog sobj3 = new StudyLog("Java", 3.5, "Inheritance");

        // Display study logs
        sobj1.Display();
        sobj2.Display();
        sobj3.Display();
    }
}
