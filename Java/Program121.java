/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program121.java
//  Description :   Demonstrates character input and ASCII conversion in Java
//  Author      :   Shardul Tapkire
//  Date        :   03/08/2025
//
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Program121 
{
    public static void main(String A[]) 
    {
        char ch;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your division: ");
        ch = sobj.next().charAt(0);

        System.out.println("ASCII value of '" + ch + "' is: " + (int)ch);
    }
}
