/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program256.java
//
//  Description : Demonstrates dynamic array input and display using separate class for logic.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayLogic
{
    public static void DisplayArray(int[] arr)
    {
        System.out.println("Elements of the array are : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

public class Program256
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iLength = sobj.nextInt();

        int[] ptr = new int[iLength];

        System.out.println("Enter the elements : ");
        for(int i = 0; i < iLength; i++)
        {
            ptr[i] = sobj.nextInt();
        }

        ArrayLogic.DisplayArray(ptr);

        sobj.close();
    }
}
