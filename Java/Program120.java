/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program120.java
//  Description :   Demonstrates basic character input using Scanner class in Java
//  Author      :   Shardul Tapkire
//  Date        :   03/08/2025
//
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Program120 
{
    public static void main(String A[]) 
    {
        char ch;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your division: ");
        ch = sobj.next().charAt(0);  // Reads the first character of the input

        System.out.println("Your division is: " + ch);
    }
}
