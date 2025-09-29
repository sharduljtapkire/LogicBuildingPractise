/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program613.java
//  Description : Accepts an integer from the user and checks whether it is 
//                a power of 2 using Brian Kernighan's algorithm by counting 
//                the number of ON bits.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program613
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
