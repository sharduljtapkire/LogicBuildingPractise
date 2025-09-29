/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program588.java
//  Description : Prints the minimum and maximum value of int in Java
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

class IntLimits
{
    public void displayLimits()
    {
        System.out.println("The value of Integer.MIN_VALUE : " + Integer.MIN_VALUE);
        System.out.println("The value of Integer.MAX_VALUE : " + Integer.MAX_VALUE);
    }
}

public class Program588
{
    public static void main(String[] args)
    {
        IntLimits limits = new IntLimits();
        limits.displayLimits();
    }
}
