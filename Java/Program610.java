/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program610.java
//  Description : Accepts an integer from the user and counts the number of 
//                ON bits (1s) in its binary representation using a concise 
//                method with arithmetic operations.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program610
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int No = sobj.nextInt();

        int iCount = 0;

        while (No != 0)
        {
            iCount += (No % 2);
            No /= 2;
        }
        
        System.out.println("Number of ON bits are : " + iCount);
    }
}
