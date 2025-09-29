/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program577.java
//  Description : Declares a 2D array with user-defined rows and columns.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program577
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;

        System.out.print("Enter Number Of Rows : ");
        iRow = sobj.nextInt();

        System.out.print("Enter Number Of Columns : ");
        iCol = sobj.nextInt();

        int[][] Arr = new int[iRow][iCol];

        sobj.close();
    }
}
