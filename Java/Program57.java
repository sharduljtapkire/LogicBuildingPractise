///////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   program57.java
//  Descreption :   to print the pattern
//  Input       :   4
//  Output      :   4   3   2   1
//  Author      :   Shardul Tapkire
//  Date        :   13/06/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Patterns
{
    void Display(int iNo)
    {
        int iCnt = 0 ;

        if(iNo < 0)         //updator
        {
            iNo = -iNo;
        } 

        for(iCnt = iNo ; iCnt >= 1 ; iCnt--)
        {
            System.out.print(iCnt+" \t");
        }
        System.out.println("");
    }
}

class Program57
{
    public static void main(String A[])
    {
        int iValue = 0 ;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Frequency :");
        iValue = sobj.nextInt();

        Patterns pobj = new Patterns();
        pobj.Display(iValue);
    }
}