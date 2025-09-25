/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program216.java
//
//  Description : Demonstrates generic Display function for arrays in Java.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program216
{
    // Generic method to display array elements
    public static <T> void Display(T[] Arr, int length)
    {
        for(int i = 0; i < length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int Size = sobj.nextInt();

        Integer[] arr = new Integer[Size];   // Using Integer (wrapper for int)

        System.out.println("Enter the elements : ");
        for(int i = 0; i < Size; i++)
        {
            arr[i] = sobj.nextInt();
        }

        // Call generic Display method
        Display(arr, Size);
    }
}
