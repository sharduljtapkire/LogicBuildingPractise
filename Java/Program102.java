/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program102.java
//  Description :   Dynamic memory allocation, input, and display Array in Java
//  Author      :   Shardul Tapkire
//  Date        :   18/07/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayProblems
{
    public void display(int[] arr, int iSize)
    {
        int iCnt = 0;

        System.out.println("Elements of the array are : ");
        for (iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(arr[i]);
        }
    }
}

public class Program102
{
    public static void main(String A[])
    {
        int iLength = 0 , iCnt = 0;
        int[] arr = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iLength = sobj.nextInt();

        

        try
        {
            // Step 1: Allocate memory dynamically
            arr = new int[iLength];
        }
        catch (OutOfMemoryError e)
        {
            System.out.println("Unable to allocate memory");
            sobj.close();
            return; 
        }

        // Step 2: Use that memory
        System.out.println("Enter the elements : ");
        for (iCnt = 0; iCnt < iLength; iCnt++)
        {
            arr[iCnt] = sobj.nextInt();
        }

        
        ArrayProblems aobj = new ArrayProblems();
        aobj.display(arr, iLength);

        // Step 3: Free memory
        arr = null;


    }
}
