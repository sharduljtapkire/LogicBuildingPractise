/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program207.java
//
//  Description : Demonstrates addition of two floating-point numbers using a 
//                separate class and taking input from the user.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Arithmetic
{
    public float Addition(float No1, float No2)
    {
        return No1 + No2;
    }
}

public class Program207
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        Arithmetic aobj = new Arithmetic();  // Create object of Arithmetic class

        System.out.println("Enter first number : ");
        float Value1 = sobj.nextFloat();

        System.out.println("Enter second number : ");
        float Value2 = sobj.nextFloat();

        float Ret = aobj.Addition(Value1, Value2);  // Call Addition method

        System.out.println("Addition is : " + Ret);

        sobj.close();
    }
}
