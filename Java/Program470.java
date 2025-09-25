/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program470.java
//
//  Description : Accepts a matrix from the user, displays it, 
//                counts the number of even elements, and calculates 
//                the summation of all elements using a custom Matrix class.
//
//  Example     :
//                Enter number of rows : 2
//                Enter number of columns : 3
//                Please enter the elements of matrix : 1 2 3 4 5 6
//                Output :
//                Elements of the matrix are : 
//                1   2   3
//                4   5   6
//                Number of even elements are : 3
//                Summation is : 21
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Matrix
{
    private int Arr[][];

    public Matrix(int A, int B)
    {
        Arr = new int [A][B];
    }

    public void Accept()
    {
        System.out.println("Please enter the elements of matrix");

        Scanner sobj = new Scanner(System.in);
        int i = 0, j = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("Elements of the matrix are : ");

        int i = 0, j = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int CountEven()
    {
        int i = 0, j = 0, iCount = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] % 2 == 0)
                {
                    iCount++;
                }
            }
        }

        return iCount;
    }

    public int Summation()
    {
        int i = 0, j = 0, iSum = 0;

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                iSum = iSum + Arr[i][j];
            }
        }

        return iSum;
    }
}

class Program470
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int iCol = sobj.nextInt();
        
        Matrix mobj = new Matrix(iRow,iCol);

        mobj.Accept();

        mobj.Display();  

        int iRet = mobj.CountEven();

        System.out.println("Number of even elements are : "+iRet);     

        iRet = mobj.Summation();

        System.out.println("Summation is : "+iRet);  
    }
}
