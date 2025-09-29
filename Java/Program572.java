/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program572.java
//  Description : Checks whether a given number is an Armstrong number.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArmstrongLogic
{
    public int power(int A, int B)
    {
        int result = 1;
        for (int i = 1; i <= B; i++)
        {
            result = result * A;
        }
        return result;
    }

    public int countDigits(int number)
    {
        int count = 0;
        while (number != 0)
        {
            count++;
            number = number / 10;
        }
        return count;
    }

    public boolean checkArmstrong(int number)
    {
        int sum = 0;
        int temp = number;
        int digits = countDigits(number);
        int digit = 0;

        while (number != 0)
        {
            digit = number % 10;
            sum = sum + power(digit, digits);
            number = number / 10;
        }

        return (sum == temp);
    }
}

public class Program572
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int value = sc.nextInt();
        sc.close();

        ArmstrongLogic logic = new ArmstrongLogic();
        boolean isArmstrong = logic.checkArmstrong(value);

        if (isArmstrong)
        {
            System.out.println(value + " is an Armstrong number");
        }
        else
        {
            System.out.println(value + " is not an Armstrong number");
        }
    }
}
