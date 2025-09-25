/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program144.java
//  Description :   Accept a string and a character from user.
//  Input       :   Hello World
//                  o
//  Output      :   (just stores values, no extra logic yet)
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program144
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();   // Reads full line (like %[^'\n']s)

        System.out.println("Enter the character : ");
        char cValue = sobj.next().charAt(0);  // Reads single character

        // Just to verify input
        System.out.println("You entered string : " + str);
        System.out.println("You entered character : " + cValue);
    }
}
