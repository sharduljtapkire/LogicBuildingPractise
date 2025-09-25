/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program482.java
//
//  Description : Demonstrates retrieving and displaying the current date using
//                LocalDate class from java.time package.
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.time.LocalDate;

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

    @Override
    public String toString()
    {
        return Subject + " | " + Duration + " | " + Descrption;
    }
}

public class Program482
{
    public static void main(String A[])
    {
        LocalDate lobj = LocalDate.now();

        System.out.println(lobj);
    }
}
