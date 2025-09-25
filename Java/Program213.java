/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program213.java
//
//  Description : Demonstrates dynamic array creation in Java.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program213
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int Size = sobj.nextInt();

        // Dynamic array allocation in Java
        int[] arr = new int[Size];

        // Use the array (example: initialize values)
        for(int i = 0; i < Size; i++)
        {
            arr[i] = i + 1;
        }

        // Display the array
        System.out.println("Elements are : ");
        for(int i = 0; i < Size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // In Java, no need of delete (garbage collector handles it)
    }
}
