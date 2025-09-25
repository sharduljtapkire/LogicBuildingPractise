/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program100.java
//  Description :   Dynamic memory allocation equivalent with null check for Array         
//  Author      :   Shardul Tapkire
//  Date        :   18/07/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program100
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int length = sobj.nextInt();

        int[] arr = null;

        try
        {
            // Step 1 : Allocate the memory 
            arr = new int[length];
        }
        catch (OutOfMemoryError e)
        {
            System.out.println("Unable to allocate memory");
            sobj.close();
            return; 
        }

        // Step 2 : Use the allocated memory
        System.out.println("Memory allocated for " + length + " integers.");
        
        for(int i = 0; i < length; i++)
        {
            arr[i] = 0;
        }

        // Step 3 : Free memory? 
        arr = null;
    }
}
