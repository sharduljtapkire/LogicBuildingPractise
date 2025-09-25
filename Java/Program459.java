/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program459.java
//
//  Description : Accepts a string from the user, trims leading and trailing 
//                spaces, replaces multiple consecutive spaces with a single 
//                space, tokenizes the string into words, stores them in a 
//                HashMap with their frequencies, and finally prints all the 
//                words present in the HashMap.
//
//  Example     :
//                Input  : demo hello pune demo code hello india ppa lb hello
//                Output : demo hello pune code india ppa lb
//                (Order of output may vary because HashMap does not maintain order)
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program459
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

        // Split string into tokens
        String tokens[] = str.split(" ");

        // Create HashMap to store word frequencies
        HashMap<String, Integer> hobj = new HashMap<String, Integer>(); 

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

        // Print all words (unique keys of HashMap)
        System.out.println("\nWords are:");
        for(String s : hobj.keySet())
        {
            System.out.print(s + " ");
        }
    }
}
