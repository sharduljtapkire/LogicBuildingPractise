/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program99.java
//  Description :   Summation of Array Elements           
//  Author      :   Shardul Tapkire
//  Date        :   18/07/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayProblems
{
    public int summation(int[] arr, int iSize)
    {
        int iSum = 0 , iCnt = 0;
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + arr[iCnt];
        }
        return iSum;
    }
}

class Program99
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int[] arr = new int[5];
        int iCnt = 0;
        System.out.println("Enter the elements : ");
        for(iCnt = 0; iCnt < 5; iCnt++)
        {
            arr[iCnt] = sobj.nextInt();
        }
        
        ArrayProblems aobj = new ArrayProblems();
        int result = aobj.summation(arr, 5);
        
        System.out.println("Addition is : " + result);
        
    }
}
