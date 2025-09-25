/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program238.java
//
//  Description : Clears the bit at a specified position of a given number.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Bitwise
{
    public int ChangeBit(int iNo, int iPos)
    {
        int iMask = 1;
        iMask = iMask << (iPos - 1);  // Shift 1 to the desired position
        iMask = ~iMask;               // Invert mask
        int iResult = iNo & iMask;    // Clear bit at position
        return iResult;
    }
}

public class Program238
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        System.out.println("Enter the position : ");
        int iLocation = sobj.nextInt();

        int iRet = bobj.ChangeBit(iValue, iLocation);

        System.out.println("Updated number is : " + iRet);

        sobj.close();
    }
}
