/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program206.java
//
//  Description : Demonstrates addition of two numbers using a separate class
//                and taking input from the user.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Arithmetic
{
    public int Addition(int No1, int No2)
    {
        int Ans = No1 + No2;
        return Ans;
    }
}

public class Program206
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        Arithmetic aobj = new Arithmetic();  // Create object of Arithmetic class

        System.out.println("Enter first number : ");
        int Value1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        int Value2 = sobj.nextInt();

        int Ret = aobj.Addition(Value1, Value2);  // Call Addition method

        System.out.println("Addition is : " + Ret);

        sobj.close();
    }
}
