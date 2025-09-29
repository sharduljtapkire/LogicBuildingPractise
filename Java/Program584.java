/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program584.java
//  Description : Dynamic 2D array input, display and memory handling simulated in Java
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

    // Java handles memory automatically, so explicit deallocation is not required
    public void deallocate(int[][] Arr)
    {
        // Setting reference to null to help GC
        Arr = null;
    }
}

public class Program584
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

        MatrixOperations mo = new MatrixOperations();

        mo.accept(Arr, iRow, iCol, sobj);
        mo.display(Arr, iRow, iCol);

        // Simulate memory deallocation
        mo.deallocate(Arr);

        sobj.close();
    }
}
