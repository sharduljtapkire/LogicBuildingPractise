/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program126.java
//  Description :   Accept a character from the user and check whether it is a 
//                  Digit or not.
//  Author      :   Shardul Tapkire
//  Date        :   04/08/2025
//
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class CharX
{
    public boolean CheckDigit(char ch)
    {
        if((ch >= '0') && (ch <= '9'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Program126
{
    public static void main(String A[]) 
    {
        char cValue;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Character :");
        cValue = sobj.next().charAt(0);

        CharX cobj = new CharX();

        bRet = cobj.CheckDigit(cValue);

        if(bRet == true)
        {
            System.out.println(cValue+" Is Digit");
        }
        else
        {
            System.out.println(cValue+" Is  Not Digit");
        }
    }
}
