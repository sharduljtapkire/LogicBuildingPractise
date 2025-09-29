/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program621.java
//  Description : Accepts a sentence from the user, removes extra spaces, 
//                and rearranges the words in ascending order of their length.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

// Input Example: "i love programming in python"
// Output Example: "i in love python programming"

class Program621
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+", " ");
    
        String words[] = str.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));

        String finalstr = String.join(" ", words);

        System.out.println("Rearranged sentence by word length: " + finalstr);
    }
}
