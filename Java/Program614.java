/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program614.java
//  Description : Accepts an integer from the user and checks whether it is 
//                a power of 2 using an optimized Brian Kernighan's algorithm. 
//                The loop breaks early if more than one ON bit is found.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program614
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
            if (iCount >= 2)
            {
                break;
            }
        }

        if (iCount == 1)
        {
            System.out.println("Number is power of 2");
        }
        else
        {
            System.out.println("Number is not a power of 2");
        }
    }
}
