/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program580.java
//  Description : Demonstrates dynamic 2D array allocation in Java
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program580
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

        
        int[][] Arr = new int[iRow][];
        
        for(int i = 0; i < iRow; i++)
        {
            Arr[i] = new int[iCol];
        }

        sobj.close();
    }
}
