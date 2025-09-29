/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program620.java
//  Description : Accepts a sentence from the user, removes leading and 
//                trailing spaces, replaces multiple spaces with a single space,
//                and displays the cleaned-up sentence.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

// Input Example: "i love programming in python"
// Output Example: "i love programming in python"

class Program620
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+", " ");
    
        System.out.println("Cleaned sentence: " + str);
    }
}
