/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program122.java
//  Description :   Accept a character from the user and check whether it is a 
//                  capital letter or not. Demonstrates character input and 
//                  uppercase letter detection using ASCII value range in Java.
//  Author      :   Shardul Tapkire
//  Date        :   03/08/2025
//
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class CharX
{
    public boolean CheckCapital(char ch)
    {
        if(ch > 65)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Program122 
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
