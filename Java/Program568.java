/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program568.java
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
        int iTemp = iNo;
        int iSum = 0;

        while(iNo != 0)
        {
            int iDigit = iNo % 10;
            int iFact = 1;

            for(int i = 1; i <= iDigit; i++)
            {
                iFact *= i;
            }

            iSum += iFact;
            iNo /= 10;
        }

        return (iSum == iTemp);
    }
}

// Main class
public class Program568
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        NumberOperations nobj = new NumberOperations();

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        boolean bRet = nobj.CheckStrong(iValue);

        if(bRet)
        {
            System.out.println(iValue + " is a strong number");
        }
        else
        {
            System.out.println(iValue + " is not a strong number");
        }
    }
}
