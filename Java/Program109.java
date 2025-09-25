/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program109.java
//  Description :   Dynamic memory allocation, input, and Search Number in Array
//  Author      :   Shardul Tapkire
//  Date        :   03/08/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayProblems
{
    public boolean Search(int[] Arr, int iSize , int iNo)
    {
        int iCnt = 0;

        if((Arr == NULL) || (iSize <= 0))
        {
            return false;
        }

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if((Arr[iCnt]) == iNo)
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

class Program109
{
    public static void main(String A[])
    {
        int iLength = 0, iCnt = 0, iRet = 0 , iValue = 0;
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

        System.out.println("Enter the number which you want to search : ");
        iValue = sobj.nextInt();

        // Step 2 : Use that memory
        System.out.println("Enter the elements : ");
        for (iCnt = 0; iCnt < iLength; iCnt++)
        {
            ptr[iCnt] = sobj.nextInt();
        }

        ArrayProblems aobj = new ArrayProblems();
        bRet = aobj.Search(ptr, iLength,iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" Is Present in Array");
        }
        else
        {
            System.out.println(iValue+" Is Not Present in Array");
        }

        // Step 3 : Free memory 
        ptr = null;       
    }
}
