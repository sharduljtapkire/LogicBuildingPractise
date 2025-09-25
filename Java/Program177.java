/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program177.java
//  Description :   Accept the size and elements of an integer array from the 
//                  user, display all elements, and count the number of even 
//                  elements using a separate class method.
//
//  Input Demo  : 
//      Enter number of elements : 5
//      Enter the elements : 10 15 20 25 30
//      Output : 
//          Elements of the array are :
//          10
//          15
//          20
//          25
//          30
//          Number of even elements are : 3
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class NNumberX
{
    public int CountEven(int Arr[])
    {
        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class Program177
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the array are : ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        NNumberX nobj = new NNumberX();
        int iRet = nobj.CountEven(Arr);

        System.out.println("Number of even elements are : " + iRet);
        
        // Nullifying references for memory cleanup
        Arr = null;
        sobj = null;
    }
}
