/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program579.java
//  Description : Demonstrates a dynamically allocated 1D array using type alias concept.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program579
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0;

        System.out.print("Enter Number Of Elements : ");
        iRow = sobj.nextInt();

        int[] Arr = new int[iRow];

        sobj.close();
    }
}
