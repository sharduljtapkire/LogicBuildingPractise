/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program590.java
//  Description : Accepts a matrix and finds the minimum element
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class MatrixOperations
{
    private int[][] matrix;
    private int rows;
    private int cols;

    public MatrixOperations(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the matrix :");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public void display()
    {
        System.out.println("Elements Of Matrix Are :");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int findMinimum()
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(matrix[i][j] < min)
                {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }
}

public class Program590
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter Number Of Columns : ");
        int cols = sc.nextInt();

        MatrixOperations matOp = new MatrixOperations(rows, cols);
        matOp.accept();
        matOp.display();

        int min = matOp.findMinimum();
        System.out.println("Minimum Is : " + min);
    }
}
