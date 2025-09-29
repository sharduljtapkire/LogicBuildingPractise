/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program594.java
//  Description : Accepts a matrix, displays it, calculates summation, 
//                minimum, maximum, maximum per row, both maximum & minimum, 
//                summation of border elements, and summation of even rows.
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

// Separate class for matrix logic
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
        System.out.println("Enter number of Elements :");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[i][j] = sc.nextInt();
    }

    public void display()
    {
        System.out.println("Elements Of Matrix Are :");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }

    public int summation()
    {
        int sum = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum += arr[i][j];
        return sum;
    }

    public int minimum()
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (arr[i][j] < min)
                    min = arr[i][j];
        return min;
    }

    public int maximum()
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (arr[i][j] > max)
                    max = arr[i][j];
        return max;
    }

    public void maximumPerRow()
    {
        for (int i = 0; i < rows; i++)
        {
            int rowMax = Integer.MIN_VALUE;
            for (int j = 0; j < cols; j++)
                if (arr[i][j] > rowMax)
                    rowMax = arr[i][j];
            System.out.println("Maximum Element From Row Number : " + i + " Is : " + rowMax);
        }
    }

    public int summationBorder()
    {
        int sum = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1)
                    sum += arr[i][j];
        return sum;
    }

    public int summationEvenRow()
    {
        int sum = 0;
        for (int i = 1; i < rows; i += 2)
            for (int j = 0; j < cols; j++)
                sum += arr[i][j];
        return sum;
    }

    public void maximumMinimum()
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
            {
                if (arr[i][j] > max) max = arr[i][j];
                if (arr[i][j] < min) min = arr[i][j];
            }
        System.out.println("Maximum Element IS : " + max);
        System.out.println("Minimum Element IS : " + min);
    }
}

// Main class
public class Program594
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Of Rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter Number Of Columns : ");
        int cols = sc.nextInt();

        MatrixOperations matrix = new MatrixOperations(rows, cols);

        matrix.accept(sc);
        matrix.display();

        System.out.println("Summation Is : " + matrix.summation());
        System.out.println("Minimum Is : " + matrix.minimum());
        System.out.println("Maximum Is : " + matrix.maximum());

        matrix.maximumPerRow();
        matrix.maximumMinimum();

        System.out.println("Summation Of Border Elements Is : " + matrix.summationBorder());
        System.out.println("Summation Of Even Row Is : " + matrix.summationEvenRow());
    }
}
