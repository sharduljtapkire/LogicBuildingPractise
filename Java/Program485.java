/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program485.java
//
//  Description : Marvellous Study Tracker application. Allows the user to insert
//                multiple study logs with date, subject, duration, and description.
//                Can display all stored study logs.
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.time.LocalDate;

// Class to represent a single study log entry
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
        return Date+" | "+Subject+" | "+Duration+" | "+Descrption;
    }

    public LocalDate getDate() { return Date; }
    public String getSubject() { return Subject; }
    public double getDuration() { return Duration; }
    public String getDescription() { return Descrption; }
}

// Class to manage multiple study logs
class StudyTracker
{
    private ArrayList<StudyLog> Database = new ArrayList<StudyLog>();

    public void InsertLog()
    {
        Scanner ScanerObj = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("--- Please enter the valid details of your study ---");
        System.out.println("----------------------------------------------------");

        LocalDate DateObj = LocalDate.now();

        System.out.println("Please provide the name of subject like C/C++/Java/OS/DS");
        String sub = ScanerObj.nextLine();

        System.out.println("Enter the time period of your study in hours");
        double dur = ScanerObj.nextDouble();
        ScanerObj.nextLine();  // consume newline

        System.out.println("Please provide the description about the study for future reference");
        String desc = ScanerObj.nextLine();

        StudyLog StudyObj = new StudyLog(DateObj, sub, dur, desc);

        Database.add(StudyObj);

        System.out.println("Study Log gets stored successfully");
        System.out.println("----------------------------------------------------");
    }

    public void DisplayLog()
    {
        System.out.println("----------------------------------------------------");

        if(Database.isEmpty())
        {
            System.out.println("Nothing to display as database is empty");
            System.out.println("----------------------------------------------------");
            return;
        }

        System.out.println("----------------------------------------------------");
        System.out.println("---- Log report from Marvellous Study Tracker ------");
        System.out.println("----------------------------------------------------");

        for(StudyLog sobj : Database)
        {
            System.out.println(sobj);
        }
        System.out.println("----------------------------------------------------");
    }
}

// Main class containing the entry point
public class Program485
{
    public static void main(String A[])
    {
        StudyTracker stobj = new StudyTracker();

        stobj.DisplayLog();        

        stobj.InsertLog();
        stobj.InsertLog();
        stobj.InsertLog();

        stobj.DisplayLog();        
    }
}
