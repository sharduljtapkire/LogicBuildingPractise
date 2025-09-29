/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program612.java
//  Description : Accepts an integer from the user and counts the number of 
//                ON bits (1s) in its binary representation using Brian Kernighan's 
//                algorithm (efficient bitwise method).
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program612
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int No = sobj.nextInt();

        int iCount = 0;

        while (No != 0)
        {
            No = No & (No - 1);
            iCount++;
        }

        System.out.println("Number of ON bits are : " + iCount);
    }
}
