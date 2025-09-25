/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program114.java
//  Description :   Dynamic memory allocation, input, and Count Frequency Of Number in Array
//  Author      :   Shardul Tapkire
//  Date        :   03/08/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayProblems
{
    public int Frequency(int[] Arr, int iSize , int iNo)
    {
        int iCnt = 0 , iCount = 0;

        if((Arr == null) || (iSize <= 0))
        {
            return -1;
        }

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Arr[iCnt]) == iNo)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class Program114
{
    public static void main(String A[])
    {
        int iLength = 0, iCnt = 0, iRet = 0 , iValue = 0;
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

        System.out.println("Enter the number which you want to search : ");
        iValue = sobj.nextInt();

        // Step 2 : Use that memory
        System.out.println("Enter the elements : ");
        for (iCnt = 0; iCnt < iLength; iCnt++)
        {
            System.out.println("\nEnter the number " + (iCnt + 1) + " : ");
            ptr[iCnt] = sobj.nextInt();
        }

        ArrayProblems aobj = new ArrayProblems();
        iRet = aobj.Frequency(ptr, iLength,iValue);

        if(iRet == -1)
        {
            System.out.println("There Is Issue In Input");
        }
        else
        {
            System.out.println(iValue+" Appears "+iRet+"  times in Array");
        }

        // Step 3 : Free memory 
        ptr = null;       
    }
}
