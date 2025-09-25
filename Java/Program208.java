/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program208.java
//
//  Description : Demonstrates addition of two numbers using Java Generics.
//                Works for Float, Double, Integer, etc.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Arithmetic<T extends Number>
{
    public double Addition(T No1, T No2)
    {
        // Using double for calculation to handle all Number types
        return No1.doubleValue() + No2.doubleValue();
    }
}

public class Program208
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        Arithmetic<Float> aobj = new Arithmetic<>();  // Generic for Float

        System.out.println("Enter first number : ");
        float Value1 = sobj.nextFloat();

        System.out.println("Enter second number : ");
        float Value2 = sobj.nextFloat();

        double Ret = aobj.Addition(Value1, Value2);  // Call generic Addition

        System.out.println("Addition is : " + Ret);

        sobj.close();
    }
}
