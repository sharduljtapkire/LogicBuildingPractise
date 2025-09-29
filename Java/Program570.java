/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program570.java
//  Description : Checks whether a number is a Strong number using precomputed factorials.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

// Business logic class
class NumberOperations
{
    // Precomputed factorials for digits 0-9
    private final int[] Factorial = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

    // Method to check if a number is Strong
    public boolean CheckStrong(int iNo)
    {
        int temp = iNo;
        int sum = 0;

        while(iNo != 0)
        {
            int digit = iNo % 10;
            sum += Factorial[digit];
            iNo /= 10;
        }

        return (sum == temp);
    }
}

// Main class
public class Program570
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
