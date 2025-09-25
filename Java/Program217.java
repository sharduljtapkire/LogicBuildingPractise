/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program216.java
//
//  Description : Demonstrates generic Display function for arrays in Java.
//                Equivalent of C++ Program216 (template based).
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

        // Use Integer instead of int (wrapper type for generics)
        Integer[] arr = new Integer[Size];

        System.out.println("Enter the elements : ");
        for(int i = 0; i < Size; i++)
        {
            arr[i] = sobj.nextInt();
        }

        // Call generic Display method
        Display(arr, Size);

        sobj.close();
    }
}
