/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program574.java
//  Description : Checks whether a given number is a Magic number (digital root = 1).
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class MagicLogic
{
    public boolean checkMagic(int number)
    {
        int sum = number;
        int digit = 0;

        while (sum > 9)
        {
            number = sum;
            sum = 0;

            while (number != 0)
            {
                digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            }
        }

        return (sum == 1);
    }
}

public class Program574
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int value = sc.nextInt();
        sc.close();

        MagicLogic logic = new MagicLogic();
        boolean isMagic = logic.checkMagic(value);

        if (isMagic)
        {
            System.out.println(value + " is a Magic number");
        }
        else
        {
            System.out.println(value + " is not a Magic number");
        }
    }
}
