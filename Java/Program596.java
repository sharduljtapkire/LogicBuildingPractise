/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program596.java
//  Description : Accepts a matrix, displays it, calculates summation, 
//                minimum, maximum, maximum per row, both maximum & minimum, 
//                summation of border elements, summation of even rows, and
//                displays elements equal to sum of their neighbours.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class MatrixOperations
{
    private int[][] arr;
    private int rows;
    private int cols;

    public MatrixOperations(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        arr = new int[rows][cols];
    }

    public void accept(Scanner sc)
    {
        System.out.println("enter number of Elements :");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void display()
    {
        System.out.println("Elements Of Matrix Are  :");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int summation()
    {
        int sum = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public int minimum()
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (arr[i][j] < min)
                {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public int maximum()
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public void maximumRow()
    {
        for (int i = 0; i < rows; i++)
        {
            int rowMax = Integer.MIN_VALUE;
            for (int j = 0; j < cols; j++)
            {
                if (arr[i][j] > rowMax)
                {
                    rowMax = arr[i][j];
                }
            }
            System.out.println("Maximum Element From Row Number : " + i + " Is : " + rowMax);
        }
    }

    public void maximumMinimum()
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (arr[i][j] > max)
                {
                    max = arr[i][j];
                }
                if (arr[i][j] < min)
                {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Maximum Element IS : " + max);
        System.out.println("Minimum Element IS : " + min);
    }

    public int summationBorder()
    {
        int sum = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1)
                {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public int summationEvenRow()
    {
        int sum = 0;
        for (int i = 0; i < rows; i++)
        {
            if (i % 2 != 0)
            {
                for (int j = 0; j < cols; j++)
                {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public void displayNeighbours()
    {
        System.out.println("Neighbours Are :");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 1; j < cols - 1; j++)
            {
                if (arr[i][j] == arr[i][j - 1] + arr[i][j + 1])
                {
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }
        System.out.println();
    }
}

public class Program596
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Of Rows :");
        int rows = sc.nextInt();

        System.out.print("Enter Number Of Columns :");
        int cols = sc.nextInt();

        MatrixOperations matrix = new MatrixOperations(rows, cols);

        matrix.accept(sc);
        matrix.display();

        int result = matrix.summation();
        System.out.println("Summation Is : " + result);

        result = matrix.minimum();
        System.out.println("Minimum Is : " + result);

        result = matrix.maximum();
        System.out.println("Maximum Is : " + result);

        matrix.maximumRow();

        matrix.maximumMinimum();

        result = matrix.summationBorder();
        System.out.println("Summation Of Border Elements Is : " + result);

        result = matrix.summationEvenRow();
        System.out.println("Summation Of Even Row Is : " + result);

        matrix.displayNeighbours();

        sc.close();
    }
}
