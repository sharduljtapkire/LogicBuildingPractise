/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program467.java
//
//  Description : Demonstrates creation of a 2D matrix using a Matrix class 
//                and prints the number of rows and columns.
//
//  Example     :
//                Matrix mobj = new Matrix(4,3);
//                Output : 
//                  4   (number of rows)
//                  3   (number of columns)
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Matrix
{
    public int Arr[][];

    public Matrix(int A, int B)
    {
        Arr = new int [A][B];
    }
}

class Program467
{
    public static void main(String A[])
    {
        Matrix mobj = new Matrix(4,3);

        System.out.println("Number of rows : " + mobj.Arr.length);        // 4
        System.out.println("Number of columns : " + mobj.Arr[0].length);  // 3
    }
}
