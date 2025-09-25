/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program175.java
//  Description :   Accept the size and elements of an integer array from the 
//                  user, display all elements, and demonstrate memory cleanup.
//
//  Input Demo  : 
//      Enter number of elements : 5
//      Enter the elements : 10 20 30 40 50
//      Output : 
//          Elements of the array are :
//          10
//          20
//          30
//          40
//          50
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program175
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

        // Nullifying references for memory cleanup
        Arr = null;
        sobj = null;
    }
}
