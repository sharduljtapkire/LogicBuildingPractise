/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program651.java
//  Description : Demonstration of static members in Java
//                Employee ID is auto-incremented using a static counter.
//                Shows use of static block and constructor.
//  Author      : Shardul Tapkire
//  Date        : 01/10/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Employee
{
    public int EmpID;
    public String EmpName;
    public int EmpAge;
    public String EmpAddress;
    public int EmpSalary;

    private static int Counter;

    // Static block (executed only once when class is loaded)
    static
    {
        System.out.println("Inside static block");
        Counter = 1;
    }

    // Constructor (assigns auto-increment ID)
    public Employee(String b, int c, String d, int e)
    {
        System.out.println("Inside constructor");
        this.EmpID = Counter++;
        this.EmpName = b;
        this.EmpAge = c;
        this.EmpAddress = d;
        this.EmpSalary = e;
    }
}

class Program651
{
    public static void main(String A[])
    {
        Employee eobj1 = new Employee("Amit",23,"Pune",21000);
        Employee eobj2 = new Employee("Sagar",23,"Pune",21000);
        Employee eobj3 = new Employee("Pooja",23,"Pune",21000);
        Employee eobj4 = new Employee("Gauri",23,"Pune",21000);

        System.out.println("Employee 1 ID: " + eobj1.EmpID);
        System.out.println("Employee 2 ID: " + eobj2.EmpID);
        System.out.println("Employee 3 ID: " + eobj3.EmpID);
        System.out.println("Employee 4 ID: " + eobj4.EmpID);
    }
}
