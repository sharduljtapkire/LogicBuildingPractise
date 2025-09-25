/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program223.java
//
//  Description : Counts the number of 1s in the binary representation of a given number.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class NumberOperations
{
    public int CountOne(int iNo)
    {
        int iCount = 0;

        while(iNo != 0)
        {
            iCount = iCount + (iNo % 2);
            iNo = iNo / 2;
        }

        return iCount;
    }
}

public class Program223
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();
        
        NumberOperations obj = new NumberOperations();
        int iRet = obj.CountOne(iValue);
        
        System.out.println("Number of 1s : " + iRet);
        
        sobj.close();
    }
}
