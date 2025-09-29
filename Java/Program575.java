/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program575.java
//  Description : Checks whether a given number is a Disarium number.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class DisariumLogic
{
    private int power(int base, int exp)
    {
        int result = 1;
        for (int i = 1; i <= exp; i++)
        {
            result = result * base;
        }
        return result;
    }

    private int countDigits(int number)
    {
        int count = 0;
        while (number != 0)
        {
            count++;
            number = number / 10;
        }
        return count;
    }

    public boolean checkDisarium(int number)
    {
        int sum = 0;
        int temp = number;
        int digits = countDigits(number);

        while (number != 0)
        {
            int digit = number % 10;
            sum = sum + power(digit, digits);
            digits--;
            number = number / 10;
        }

        return (sum == temp);
    }
}

public class Program575
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int value = sc.nextInt();
        sc.close();

        DisariumLogic logic = new DisariumLogic();
        boolean isDisarium = logic.checkDisarium(value);

        if (isDisarium)
        {
            System.out.println(value + " is a Disarium number");
        }
        else
        {
            System.out.println(value + " is not a Disarium number");
        }
    }
}
