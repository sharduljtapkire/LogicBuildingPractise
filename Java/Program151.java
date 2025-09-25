/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program151.java
//  Description :   Accept a string and a character from user and count 
//                  frequency of that character (case-insensitive for letters, 
//                  using iDisplacement).
//
//  Input Demo 1: 
//      String : deRm2dfr
//      Char   : R
//      Output : 2 (Correct)
//
//  Input Demo 2: 
//      String : Demo@23@re
//      Char   : @
//      Output : 0 (Wrong, logic ignores non-alphabet characters)
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public int CharFrequency(String str, char ch)
    {
        int iCount = 0;
        int iDisplacement = 0;

        if ((ch >= 'A') && (ch <= 'Z'))          // Capital
        {
            iDisplacement = 32;
        }
        else if ((ch >= 'a') && (ch <= 'z'))     // Small
        {
            iDisplacement = -32;
        }
        else                                      // Other
        {
            iDisplacement = 0;
        }

        for (int i = 0; i < str.length(); i++)
        {
            char curr = str.charAt(i);

            if (curr == ch || curr == (char)(ch + iDisplacement))
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class Program151
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the character : ");
        char cValue = sobj.next().charAt(0);

        StringX sx = new StringX();
        int iRet = sx.CharFrequency(Arr, cValue);

        System.out.println(cValue + " occurs " + iRet + " times");
    }
}
