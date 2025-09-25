///////////////////////////////////////////////////////
//
//  File name   :   program37.java
//  Descreption :   Even Factors
//  Author      :   Shardul Tapkire
//  Date        :   20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class Factors
{
    void DisplayEvenFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)     // Updator
        {   
            iNo = -iNo; 
        }

        for(iCnt = 1; iCnt <= iNo ; iCnt++)
        {
            if((iNo % iCnt == 0) && (iCnt % 2 == 0))
            {
                System.out.println("Factor Is :"+iCnt);
            }
        }
    }
}

class Program37
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();         
        
        Factors fobj = new Factors();
        fobj.DisplayEvenFactors(iValue);
    }
}