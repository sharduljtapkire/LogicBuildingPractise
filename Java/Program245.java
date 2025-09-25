/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program245.java
//
//  Description : Checks whether the 27th bit of a given number is ON or OFF using hexadecimal mask.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Bitwise
{
    public boolean CheckBit(int iNo)
    {
        int iMask = 0x04000000; // 27th bit
        int iResult = iNo & iMask;

        return (iResult == iMask);
    }
}

public class Program245
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        boolean bRet = bobj.CheckBit(iValue);

        if(bRet)
        {
            System.out.println("27th bit is ON");
        }
        else
        {
            System.out.println("27th bit is OFF");
        }

        sobj.close();
    }
}
