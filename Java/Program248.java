/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program248.java
//
//  Description : Clears the 12th bit of a given number using hexadecimal mask.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Bitwise
{
    public int ChangeBit(int iNo) // Clear 12th bit
    {
        int iMask = 0xfffff7ff; // 12th bit mask
        int iResult = iNo & iMask;
        return iResult;
    }
}

public class Program248
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        int iRet = bobj.ChangeBit(iValue);

        System.out.println("Updated number is : " + iRet);

        sobj.close();
    }
}
