///////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   program46.java
//  Descreption :   to extract and print individual digits from number 
//  Author      :   Shardul Tapkire
//  Date        :   13/06/2025
//
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Digits 
{
    void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}
class Program46 
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        dobj.DisplayDigits(iValue);
    }
}