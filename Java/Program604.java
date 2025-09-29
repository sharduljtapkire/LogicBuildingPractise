/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program604.java
//  Description : Accepts an IP address as four integers, converts it into a 
//                single 32-bit integer using bitwise operations, displays the 
//                formed number, and then splits it back to display the original 
//                IP address. Intended to display unsigned integers.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program604
{
    public static int FormIP(int No1, int No2, int No3, int No4)
    {
        No1 = No1 << 24;
        No2 = No2 << 16;
        No3 = No3 << 8;
        No4 = No4 << 0;
        
        int IP = No1 | No2 | No3 | No4;

        return IP;
    }

    public static void SplitIP(int IP)
    {
        int No1 = 0, No2 = 0, No3 = 0, No4 = 0;
        
        int Mask2 = 0x00ff0000;
        int Mask3 = 0x0000ff00;
        int Mask4 = 0x000000ff;

        No1 = IP >> 24;
        No2 = (IP & Mask2) >> 16;
        No3 = (IP & Mask3) >> 8;
        No4 = IP & Mask4;

        System.out.println("IP address is : ");
       
        System.out.println((No1 & 0xff) + "." + (No2 & 0xff) + "." + (No3 & 0xff) + "." + (No4 & 0xff));
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

        SplitIP(iRet);
    }
}
