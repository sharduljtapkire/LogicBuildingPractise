/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program619.java
//  Description : Segregates 0s and 1s in a binary array using a two-pointer 
//                approach in O(N) time without extra space.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program619
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        //           0,1,2,3,4,5,6,7
        int Arr[] = {0, 1, 0, 0, 1, 0, 0, 1};

        int iStart = 0;
        int iEnd = Arr.length - 1;

        while (iStart < iEnd)
        {
            if (Arr[iStart] == 0)
            {
                iStart++;
            }
            else if (Arr[iEnd] == 1)
            {
                iEnd--;
            }
            else
            {
                Arr[iStart] = 0;
                Arr[iEnd] = 1;
                iStart++;
                iEnd--;
            }
        }

        System.out.println("Segregated array is : ");
        for (int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i] + "\t");
        }
        System.out.println();
    }
}
