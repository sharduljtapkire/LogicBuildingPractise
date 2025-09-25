/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program125.java
//  Description :   Accept a character from the user and check whether it is a 
//                  small (lowercase) letter using ASCII value range comparison.
//  Author      :   Shardul Tapkire
//  Date        :   04/08/2025
//
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class CharX
{
    public boolean CheckSmall(char ch)
    {
        if((ch >= 'a') && (ch <= 'z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Program125
{
    public static void main(String A[]) 
    {
        char cValue;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Character :");
        cValue = sobj.next().charAt(0);

        CharX cobj = new CharX();

        bRet = cobj.CheckSmall(cValue);

        if(bRet == true)
        {
            System.out.println(cValue+" Is Small");
        }
        else
        {
            System.out.println(cValue+" Is  Not Smalll");
        }
    }
}
