/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program609.java
//  Description : Accepts an integer from the user and counts the number of 
//                ON bits (1s) in its binary representation.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program609
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int No = sobj.nextInt();

        int Digit = 0, iCount = 0;

        while (No != 0)
        {
            Digit = No % 2;
            if (Digit == 1)
            {
                iCount++;
            }
            No = No / 2;
        }
        
        System.out.println("Number of ON bits are : " + iCount);
    }
}
