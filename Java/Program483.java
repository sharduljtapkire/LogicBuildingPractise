/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program483.java
//
//  Description : Demonstrates maintaining a study log with date, subject, 
//                duration, and description. Stores multiple records in an
//                ArrayList and displays them.
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.time.LocalDate;

class StudyLog
{
    public LocalDate Date;
    public String Subject;
    public double Duration;
    public String Descrption;

    public StudyLog(LocalDate A, String B, double C, String D)
    {
        this.Date = A;
        this.Subject = B;
        this.Duration = C;
        this.Descrption = D;
    }

    @Override
    public String toString()
    {
        return Date + " | " + Subject + " | " + Duration + " | " + Descrption;
    }
}

public class Program483
{
    public static void main(String A[])
    {
        StudyLog sobj1 = new StudyLog(LocalDate.now(), "C", 2.5, "Pointer and Array");
        StudyLog sobj2 = new StudyLog(LocalDate.now(), "C++", 2, "Polymorphism");
        StudyLog sobj3 = new StudyLog(LocalDate.now(), "Java", 3.5, "Inheritance");
        StudyLog sobj4 = new StudyLog(LocalDate.now(), "C", 1.5, "Pointer and Array");
        StudyLog sobj5 = new StudyLog(LocalDate.now(), "C", 1.0, "Pointer and Array");

        ArrayList<StudyLog> aobj = new ArrayList<StudyLog>();

        aobj.add(sobj1);
        aobj.add(sobj2);
        aobj.add(sobj3);
        aobj.add(sobj4);
        aobj.add(sobj5);

        for (StudyLog sobj : aobj)
        {
            System.out.println(sobj);
        }
    }
}
