///////////////////////////////////////////////////////
//
//  File name   :   program33.java
//  Descreption :   Factors
//  Author      :   Shardul Tapkire
//  Date        :   20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class Factors
{
    void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program33
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();         
        
        Factors fobj = new Factors();
        fobj.DisplayFactors(iValue);
    }
}