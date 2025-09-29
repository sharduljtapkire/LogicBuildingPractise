/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program617.java
//  Description : Finds and displays the non-paired element in an integer 
//                array where all other elements occur in pairs using 
//                bitwise XOR operation (efficient method).
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program617
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {7, 2, 9, 7, 3, 8, 2, 9, 3};

        int iFound = 0;

        for (int i = 0; i < Arr.length; i++)
        {
            iFound = iFound ^ Arr[i];
        }

        System.out.println("Non paired element is : " + iFound);
    }
}
