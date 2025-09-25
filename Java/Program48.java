///////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   program48.java
//  Descreption :   to count individual digits from number 
//  Author      :   Shardul Tapkire
//  Date        :   13/06/2025
//
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Digits 
{
    int CountDigits(int iNo)
    {
        int iCnt = 0;

        while(iNo != 0)
        {
            iNo = iNo / 10;
            iCnt++;
        }
        return iCnt;
    }
}
class Program48 
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0 ;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.CountDigits(iValue);

        System.out.println("Number of digits are : "+iRet);
    }
}
