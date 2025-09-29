/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program569.java
//  Description : Checks whether a number is a Strong number or not.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

// Business logic class
class NumberOperations
{
    // Method to check if a number is Strong
    public boolean CheckStrong(int iNo)
    {
        int temp = iNo;
        int sum = 0;

        while(iNo != 0)
        {
            int digit = iNo % 10;
            int fact = 1;

            for(int i = 1; i <= digit; i++)
            {
                fact *= i;
            }

            sum += fact;
            iNo /= 10;
        }

        return (sum == temp);
    }
}

// Main class
public class Program569
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        NumberOperations nobj = new NumberOperations();

        System.out.println("Enter number : ");
        int value = sc.nextInt();

        boolean result = nobj.CheckStrong(value);

        if(result)
        {
            System.out.println(value + " is a strong number");
        }
        else
        {
            System.out.println(value + " is not a strong number");
        }
    }
}
