/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program581.java
//  Description : Dynamic 2D array input and display
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program581
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

        System.out.println("Enter elements of the matrix : ");
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Elements of the matrix are : ");
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }

        sobj.close();
    }
}
