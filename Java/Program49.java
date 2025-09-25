///////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   program49.java
//  Descreption :   to count even digits from number 
//  Author      :   Shardul Tapkire
//  Date        :   13/06/2025
//
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Digits 
{
    int CountEvenDigits(int iNo)
    {
        int iDigit = 0;
        int iCnt = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                iCnt++;
            }        
            iNo = iNo / 10;
        }
        return iCnt;
    }
}
class Program49 
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0 ;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.CountEvenDigits(iValue);

        System.out.println("Number of  even digits are : "+iRet);
    }
}