/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program650.java
//  Description : Demonstration of User-Defined Class (Employee) in Java
//                Creating an object and displaying its details using toString().
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

    public Employee(int a, String b, int c, String d, int e)
    {
        this.EmpID = a;
        this.EmpName = b;
        this.EmpAge = c;
        this.EmpAddress = d;
        this.EmpSalary = e;
    }

    // Overriding toString() to display employee details
    public String toString()
    {
        return "Employee Details: [ID=" + EmpID + 
               ", Name=" + EmpName + 
               ", Age=" + EmpAge + 
               ", Address=" + EmpAddress + 
               ", Salary=" + EmpSalary + "]";
    }
}

class Program650
{
    public static void main(String A[])
    {
        Employee eobj = new Employee(11,"Amit",23,"Pune",21000);

        // This will now call the overridden toString()
        System.out.println(eobj);
    }
}
