/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program578.java
//  Description : Dynamically allocates a 1D array with user-defined size.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program578
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
