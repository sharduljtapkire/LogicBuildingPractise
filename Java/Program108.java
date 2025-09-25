/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program108.java
//  Description :   Dynamic memory allocation, input, and Search 11 in Array
//  Author      :   Shardul Tapkire
//  Date        :   03/08/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayProblems
{
    public boolean Search(int[] Arr, int iSize)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Arr[iCnt]) == 11)
            {
                break;
            }
        }

        if(iCnt == iSize)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class Program108
{
    public static void main(String A[])
    {
        int iLength = 0, iCnt = 0, iRet = 0;
        int[] ptr = null;
        boolean bRet = false;

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
        bRet = aobj.Search(ptr, iLength);

        if(bRet == true)
        {
            System.out.println("11 Is Present");
        }
        else
        {
            System.out.println("11 is not present");
        }

        // Step 3 : Free memory 
        ptr = null;       
    }
}
