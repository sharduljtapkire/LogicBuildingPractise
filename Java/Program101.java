/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program101.java
//  Description :   Dynamic array allocation, input, and display Array in Java
//  Author      :   Shardul Tapkire
//  Date        :   18/07/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program101
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
            // Step 1 : Allocate memory dynamically
            arr = new int[iLength];
        }
        catch (OutOfMemoryError e)
        {
            System.out.println("Unable to allocate memory");
            sobj.close();
            return;  
        }

        // Step 2 : Use the allocated memory
        System.out.println("Enter the elements : ");
        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Entered elements are : ");
        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.println(arr[iCnt]);
        }

        // Step 3 : Free memory
        arr = null;
    }
}
