/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program456.java
//
//  Description : Accepts a string from the user, trims leading and trailing 
//                spaces, replaces multiple consecutive spaces with a single 
//                space, tokenizes the string into words, stores words and their 
//                frequencies in a HashMap, and then displays each word along 
//                with its frequency.
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program456
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");

        String str = sobj.nextLine();

        // Remove leading and trailing spaces
        str = str.trim();

        // Replace multiple spaces with a single space
        str = str.replaceAll("\\s+"," ");

        // Split the string into words
        String tokens[] = str.split(" ");

        // Create HashMap to store word frequencies
        HashMap<String, Integer> hobj = new HashMap<String, Integer>(); 

        // Traverse tokens and update HashMap
        for(String s : tokens)
        {
            if(hobj.containsKey(s))
            {
                hobj.put(s, hobj.get(s) + 1);
            }
            else
            {
                hobj.put(s, 1);
            }
        }

        // Display word frequencies
        System.out.println("\nWord Frequencies:");
        for(String s : hobj.keySet())
        {
            System.out.println(s + " : " + hobj.get(s));
        }
    }
}
