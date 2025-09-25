/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program237.java
//
//  Description : Clears the 12th bit of a given number using bitwise AND.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Bitwise
{
    public int ChangeBit(int iNo)   // Clear 12th bit
    {
        int iMask = 0xFFFFEFFF; // 4294965247 in hexadecimal
        int iResult = iNo & iMask;
        return iResult;
    }
}

public class Program237
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
