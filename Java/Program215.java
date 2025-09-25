/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program215.java
//
//  Description : Demonstrates dynamic array allocation in Java.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program215
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int Size = sobj.nextInt();

        // Dynamic array allocation in Java
        int[] arr = new int[Size];

        // Example usage (initialize with values)
        for(int i = 0; i < Size; i++)
        {
            arr[i] = (i + 1) * 10;
        }

        // Display array elements
        System.out.println("Elements in array are : ");
        for(int i = 0; i < Size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // No delete[] in Java, garbage collector handles memory
    }
}
