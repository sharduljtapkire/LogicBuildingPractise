/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program115.java
//  Description :   Dynamic memory allocation, input, and Find Maximum Number in Array
//  Author      :   Shardul Tapkire
//  Date        :   03/08/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayProblems
{
    public int Maximum(int[] Arr, int iSize)
    {
        int iCnt = 0 , iMax = 0;

        if((Arr == null) || (iSize <= 0))
        {
            System.out.println("Invalid Input");
            return -1;
        }
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Arr[iCnt]) > iMax)
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
    }
}

class Program115
{
    public static void main(String A[])
    {
        int iLength = 0, iCnt = 0, iRet = 0;
        int[] ptr = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iLength = sobj.nextInt();

        try
        {
            // Step 1 : Allocate memory dynamically 
            ptr = new int[iLength];
        }
        catch (OutOfMemoryError e)
        {
            System.out.println("Unable to allocate memory");
            sobj.close();
            return; 
        }

        // Step 2 : Use that memory
        System.out.println("Enter the elements : ");
        for (iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.println("\nEnter the number " + (iCnt + 1) + " : ");
            ptr[iCnt] = sobj.nextInt();
        }

        ArrayProblems aobj = new ArrayProblems();
        iRet = aobj.Maximum(ptr, iLength);

        System.out.println("Maximum element is : "+iRet);

        // Step 3 : Free memory 
        ptr = null;       
    }
}
