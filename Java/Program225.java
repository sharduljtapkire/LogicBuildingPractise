/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program225.java
//
//  Description : Displays the given number in Decimal, Octal, and Hexadecimal formats.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program225
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        System.out.println("Number in Decimal format : " + iValue);
        System.out.println("Number in Octal format : " + Integer.toOctalString(iValue));
        System.out.println("Number in Hexadecimal format : " + Integer.toHexString(iValue));

        sobj.close();
    }
}
