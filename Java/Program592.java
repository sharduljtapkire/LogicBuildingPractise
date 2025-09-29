/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program592.java
//  Description : Accepts a matrix, displays it, finds summation, minimum, 
//                maximum, maximum per row, and both maximum & minimum.
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
        System.out.println("Enter number of elements :");
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

    public int summation()
    {
        int sum = 0;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int minimum()
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

    public int maximum()
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(matrix[i][j] > max)
                {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public void maximumPerRow()
    {
        for(int i = 0; i < rows; i++)
        {
            int rowMax = Integer.MIN_VALUE;
            for(int j = 0; j < cols; j++)
            {
                if(matrix[i][j] > rowMax)
                {
                    rowMax = matrix[i][j];
                }
            }
            System.out.println("Maximum element from row " + i + " is : " + rowMax);
        }
    }

    public void maximumMinimum()
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(matrix[i][j] > max)
                    max = matrix[i][j];
                if(matrix[i][j] < min)
                    min = matrix[i][j];
            }
        }

        System.out.println("Maximum Element Is : " + max);
        System.out.println("Minimum Element Is : " + min);
    }
}

public class Program592
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

        System.out.println("Summation Is : " + matOp.summation());
        System.out.println("Minimum Is : " + matOp.minimum());
        System.out.println("Maximum Is : " + matOp.maximum());

        matOp.maximumPerRow();
        matOp.maximumMinimum();
    }
}
