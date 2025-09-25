/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program228.java
//
//  Description : Checks whether the 4th bit of a given number is ON.
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
        int iMask = 8;  // 4th bit mask (2^3)
        int iResult = iNo & iMask;

        return (iResult == iMask);
    }
}

public class Program228
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
            System.out.println("4th bit is ON");
        }
        else
        {
            System.out.println("4th bit is OFF");
        }

        sobj.close();
    }
}
