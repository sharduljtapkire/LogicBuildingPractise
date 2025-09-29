/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program601.java
//  Description : Accepts an IP address as four integers, forms a combined 
//                representation (currently placeholder) and displays it.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program601
{
    public static int FormIP(int No1, int No2, int No3, int No4)
    {
        // Placeholder implementation
        return 0;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter IP address : ");
        int No1 = sobj.nextInt();
        int No2 = sobj.nextInt();
        int No3 = sobj.nextInt();
        int No4 = sobj.nextInt();
        
        int iRet = FormIP(No1, No2, No3, No4);

        System.out.println("Formed number contains IP address is : " + iRet);
    }
}
