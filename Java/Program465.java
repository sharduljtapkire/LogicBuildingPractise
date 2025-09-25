/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program465.java
//
//  Description : Accepts a string from the user and checks whether it is a 
//                palindrome or not. Uses StringBuilder to reverse the string.
//
//  Example     :
//                Input  : madam
//                Output : String is palindrome
//
//                Input  : hello
//                Output : String is not palindrome
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program465
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter word : ");

        String str = sobj.nextLine();

        // Create StringBuilder and reverse it
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        // Check if original string equals reversed string
        if(str.equals(new String(sb)))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}
