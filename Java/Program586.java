/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program586.java
//  Description : Accepts a 2D matrix, displays it, finds maximum element
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class MatrixOperations
{
    public void accept(int[][] Arr, int iRow, int iCol, Scanner sobj)
    {
        System.out.println("Enter number of elements : ");
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void display(int[][] Arr, int iRow, int iCol)
    {
        System.out.println("Elements Of Matrix Are : ");
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int maximum(int[][] Arr, int iRow, int iCol)
    {
        int iMax = Arr[0][0];
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
            }
        }
        return iMax;
    }
}

public class Program586
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number Of Rows : ");
        int iRow = sobj.nextInt();

        System.out.print("Enter Number Of Columns : ");
        int iCol = sobj.nextInt();

        int[][] Arr = new int[iRow][iCol];

        MatrixOperations mo = new MatrixOperations();

        mo.accept(Arr, iRow, iCol, sobj);
        mo.display(Arr, iRow, iCol);

        int iRet = mo.maximum(Arr, iRow, iCol);
        System.out.println("Maximum Is : " + iRet);

        sobj.close();
    }
}
