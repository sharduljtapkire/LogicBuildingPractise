/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program106.java
//  Description :   Dynamic memory allocation, input, and sum even numbers in Array
//  Author      :   Shardul Tapkire
//  Date        :   18/07/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayProblems
{
    public int SumEven(int[] Arr, int iSize)
    {
        int iCnt = 0, iSum = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            iSum = iSum + Arr[iCnt];
        }
    }

    return iSum;
    }
}

class Program106
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
            ptr[iCnt] = sobj.nextInt();
        }

        ArrayProblems aobj = new ArrayProblems();
        iRet = aobj.SumEven(ptr, iLength);

        System.out.println("Summation is : " + iRet);

        // Step 3 : Free memory 
        ptr = null;

        
    }
}
