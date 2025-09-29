/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program567.java
//  Description : Calculates the generic root (digital root) of a number.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

// Business logic class
class NumberOperations
{
    public int GenericRoot(int iNo)
    {
        int iSum = iNo;
        int iDigit = 0;

        while(iSum > 9)
        {
            iNo = iSum;
            iSum = 0;

            while(iNo != 0)
            {
                iDigit = iNo % 10;
                iSum = iSum + iDigit;
                iNo = iNo / 10;
            }
        }

        return iSum;
    }
}

// Main class
public class Program567
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        NumberOperations nobj = new NumberOperations();

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        int iRet = nobj.GenericRoot(iValue);

        System.out.println("Generic Root of " + iValue + " is " + iRet);
    }
}
