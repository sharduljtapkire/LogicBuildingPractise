/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program573.java
//  Description : Checks whether a given number is a Niven number.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class NivenLogic
{
    public boolean checkNiven(int number)
    {
        int sum = 0;
        int temp = number;
        int digit = 0;

        while (number != 0)
        {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        return (temp % sum == 0);
    }
}

public class Program573
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int value = sc.nextInt();
        sc.close();

        NivenLogic logic = new NivenLogic();
        boolean isNiven = logic.checkNiven(value);

        if (isNiven)
        {
            System.out.println(value + " is a Niven number");
        }
        else
        {
            System.out.println(value + " is not a Niven number");
        }
    }
}
