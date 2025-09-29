/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program571.java
//  Description : Prints all Strong numbers from 1 to a given range using precomputed factorials.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

// Business logic class
class NumberOperations
{
    private final int[] Factorial = {1,1,2,6,24,120,720,5040,40320,362880};

    // Check if a single number is Strong
    public boolean CheckStrong(int num)
    {
        int temp = num;
        int sum = 0;

        while(num != 0)
        {
            int digit = num % 10;
            sum += Factorial[digit];
            num /= 10;
        }

        return sum == temp;
    }

    // Print all Strong numbers from 1 to end
    public void CheckStrongRange(int end)
    {
        for(int i = 1; i <= end; i++)
        {
            if(CheckStrong(i))
            {
                System.out.println(i);
            }
        }
    }
}

// Main class
public class Program571
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        NumberOperations nobj = new NumberOperations();

        System.out.println("Enter the end point of the range: ");
        int value = sc.nextInt();

        nobj.CheckStrongRange(value);
    }
}
