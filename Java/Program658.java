/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program658.java
//  Description : Demonstration of a simple in-memory database (MarvellousDBMS)
//                using LinkedList to store Employee objects.
//  Author      : Shardul Tapkire
//  Date        : 01/10/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Employee implements Serializable
{
    public int EmpID;
    public String EmpName;
    public int EmpAge;
    public String EmpAddress;
    public int EmpSalary;

    private static int Counter;

    static
    {
        Counter = 1;
    }

    public Employee(String b, int c, String d, int e)
    {
        this.EmpID = Counter++;
        this.EmpName = b;
        this.EmpAge = c;
        this.EmpAddress = d;
        this.EmpSalary = e;
    }

    public void DisplayInformation()
    {
        System.out.println("ID : "+this.EmpID+
                           " Name : "+this.EmpName+
                           " Age : "+this.EmpAge+
                           " Address : "+this.EmpAddress+
                           " Salary : "+this.EmpSalary);
    }

    public String toString()
    {
        return "ID : "+this.EmpID+
               " Name : "+this.EmpName+
               " Age : "+this.EmpAge+
               " Address : "+this.EmpAddress+
               " Salary : "+this.EmpSalary;
    }
}

class MarvellousDBMS implements Serializable
{
    private LinkedList<Employee> Table;

    public MarvellousDBMS()
    {
        System.out.println("Marvellous DBMS started succesfully...");
        Table = new LinkedList();
    }
}

class Program658
{
    public static void main(String A[]) throws Exception
    {
        MarvellousDBMS mobj = new MarvellousDBMS();    
    }
}
