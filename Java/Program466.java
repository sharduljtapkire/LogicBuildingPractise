/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program466.java
//
//  Description : Accepts a string of words from the user and prints all words 
//                that are palindromes.
//
//  Example     :
//                Input  : hello demo madam nayan ppa level for radar
//                Output : madam
//                         nayan
//                         level
//                         radar
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program466
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string of words : ");

        String str = sobj.nextLine();
        str = str.trim();

        // Replace multiple spaces with single space
        str = str.replaceAll("\\s+"," ");

        // Split string into words
        String tokens[] = str.split(" ");

        StringBuilder sb = null;

        // Check each word for palindrome
        for(String s : tokens)
        {
            sb = new StringBuilder(s);
            sb.reverse();

            if(s.equals(new String(sb)))
            {
                System.out.println(s);
            }
        }
    }
}
