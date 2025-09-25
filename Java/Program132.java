/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program132.java
//  Description :   Accept a string from the user and display the first four
//                  characters individually on the screen using a user-defined
//                  class and method. This program demonstrates basic string
//                  manipulation using the `charAt()` method in Java.
//  Author      :   Shardul Tapkire
//  Date        :   04/08/2025
//
/////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class StringX
{
    public void Display(String Arr)
    {
        System.out.println(Arr.charAt(0));
        System.out.println(Arr.charAt(1));
        System.out.println(Arr.charAt(2));
        System.out.println(Arr.charAt(3));
    }
}
class Program132 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string:");

        String Str = sobj.next();

        StringX sxobj = new StringX();
        sxobj.Display(Str);
    }
}
