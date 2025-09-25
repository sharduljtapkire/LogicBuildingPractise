/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program489.java
//
//  Description : Marvellous Study Tracker Application with CSV export, 
//                Summary by Date and Summary by Subject functionality. 
//                Allows inserting new study logs, viewing all logs, 
//                summarizing study by date or subject, and exporting logs to CSV.
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.time.LocalDate;
import java.io.*;

// Class representing a single study log entry
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

        System.out.println("Enter the time period if your study in hours");
        double dur = ScanerObj.nextDouble();
        ScanerObj.nextLine(); // consume newline

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

    public void ExportCSV()
    {
        if(Database.isEmpty())
        {
            System.out.println("----------------------------------------------------");
            System.out.println("Nothing to export as database is empty");
            System.out.println("----------------------------------------------------");
            return;
        }

        String FileName = "MarvellousStudy.csv";

        try(FileWriter fwobj = new FileWriter(FileName))
        {
            fwobj.write("Date,Subject,Duration,Description\n");

            for(StudyLog sobj : Database)
            {
                fwobj.write(sobj.getDate() + "," +
                            sobj.getSubject().replace(",", " ") + "," +
                            sobj.getDuration() + "," +
                            sobj.getDescription().replace(",", " ") + "\n");
            }

            System.out.println("Log created successfully");
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred while creating the CSV.");
            System.out.println("Report this issue to Marvellous Infosystems");
        }
    }

    public void SummaryByDate()
    {
        System.out.println("----------------------------------------------------");

        if(Database.isEmpty())
        {
            System.out.println("Nothing to display as database is empty");
            System.out.println("----------------------------------------------------");
            return;
        }

        System.out.println("----------------------------------------------------");
        System.out.println("-- Summary By Date from Marvellous Study Tracker ---");
        System.out.println("----------------------------------------------------");

        TreeMap<LocalDate, Double> tobj = new TreeMap<LocalDate, Double>();

        for(StudyLog sobj : Database)
        {
            LocalDate lobj = sobj.getDate();
            double d = sobj.getDuration();
            tobj.put(lobj, tobj.getOrDefault(lobj, 0.0) + d);
        }

        for(LocalDate ldobj : tobj.keySet())
        {
            System.out.println("Date : " + ldobj + " Total Study " + tobj.get(ldobj));
        }

        System.out.println("----------------------------------------------------");
    }

    public void SummaryBySubject()
    {
        System.out.println("----------------------------------------------------");

        if(Database.isEmpty())
        {
            System.out.println("Nothing to display as database is empty");
            System.out.println("----------------------------------------------------");
            return;
        }

        System.out.println("----------------------------------------------------");
        System.out.println(" Summary By Subject from Marvellous Study Tracker ");
        System.out.println("----------------------------------------------------");

        TreeMap<String, Double> tobj = new TreeMap<String, Double>();

        for(StudyLog sobj : Database)
        {
            String s = sobj.getSubject();
            double d = sobj.getDuration();
            tobj.put(s, tobj.getOrDefault(s, 0.0) + d);
        }

        for(String str : tobj.keySet())
        {
            System.out.println("Subject : " + str + " Total Study " + tobj.get(str));
        }

        System.out.println("----------------------------------------------------");
    }
}

// Main class containing the entry point
public class Program489
{
    public static void main(String A[])
    {
        StudyTracker stobj = new StudyTracker();
        Scanner ScanerObj = new Scanner(System.in);
        int iChoice = 0;

        System.out.println("----------------------------------------------------");
        System.out.println("-- Welcome to Marvellous Study Tracker Application --");
        System.out.println("----------------------------------------------------");

        do
        {
            System.out.println("Please select the appropriate option");
            System.out.println("1 : Insert new Study Log into Database");
            System.out.println("2 : View All Study Logs");
            System.out.println("3 : Summary of Study Log by Date");
            System.out.println("4 : Summary of Study Log by Subject");
            System.out.println("5 : Export Study Log to CSV file");
            System.out.println("6 : Exit the application");

            iChoice = ScanerObj.nextInt();

            switch(iChoice)
            {
                case 1:
                    stobj.InsertLog();
                    break;
                case 2:
                    stobj.DisplayLog();
                    break;
                case 3:
                    stobj.SummaryByDate();
                    break;
                case 4:
                    stobj.SummaryBySubject();
                    break;
                case 5:
                    stobj.ExportCSV();
                    break;
                case 6:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Thank you for using Marvellous Study Log application");
                    System.out.println("----------------------------------------------------");
                    break;
                default:
                    System.out.println("Please enter the valid option");
            }

        } while(iChoice != 6);
    }
}
