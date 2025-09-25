/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program124.java
//  Description :   Accept a character from the user and check whether it is a 
//                  capital (uppercase) letter using ASCII value range comparison.
//  Author      :   Shardul Tapkire
//  Date        :   03/08/2025
//
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class CharX
{
    public boolean CheckCapital(char ch)
    {
        if((ch >= 'A') && (ch <= 'Z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Program124
{
    public static void main(String A[]) 
    {
        char cValue;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Character :");
        cValue = sobj.next().charAt(0);

        CharX cobj = new CharX();

        bRet = cobj.CheckCapital(cValue);

        if(bRet == true)
        {
            System.out.println(cValue+" Is Capital");
        }
        else
        {
            System.out.println(cValue+" Is  Not Capital");
        }
    }
}
