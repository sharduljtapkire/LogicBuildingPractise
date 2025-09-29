/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program616.java
//  Description : Finds and displays the non-paired element in an integer 
//                array where all other elements occur in pairs.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program616
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {7, 2, 9, 7, 3, 8, 2, 9, 3};

        boolean bFlag = true;
        int iFound = 0;

        for (int i = 0; i < Arr.length; i++)
        {
            bFlag = false;

            for (int j = i + 1; j < Arr.length; j++)
            {
                if (Arr[i] == Arr[j])
                {
                    bFlag = true;
                    break;
                }
            }

            if (!bFlag)
            {
                iFound = Arr[i];
            }
        }

        System.out.println("Non paired element is : " + iFound);
    }
}
