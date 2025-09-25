///////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   program50.java
//  Descreption :   to sum digits from number 
//  Author      :   Shardul Tapkire
//  Date        :   13/06/2025
//
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Digits 
{
    int SumDigits(int iNo)
    {
        int iSum = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit; 
            iNo = iNo / 10;
        }
        return iSum;
    }
}
class Program50
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0 ;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.SumDigits(iValue);

        System.out.println("Summation of digits are : "+iRet);
    }
}