/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program149.java
//  Description :   Accept a string and a character from user and count 
//                  frequency of that character (case-insensitive for letters, 
//                  works for special symbols and digits too).
//
//  Input Demo 1: 
//      String : deRm2dfr
//      Char   : R
//      Output : 2 (Correct)
//
//  Input Demo 2: 
//      String : Demo@23@re
//      Char   : @
//      Output : 2 (Correct)
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

        for (int i = 0; i < str.length(); i++)
        {
            char curr = str.charAt(i);

            if ((ch >= 'A') && (ch <= 'Z'))                  // Capital letter
            {
                if (curr == ch || curr == (char)(ch + 32))
                {
                    iCount++;
                }
            }
            else if ((ch >= 'a') && (ch <= 'z'))             // Small letter
            {
                if (curr == ch || curr == (char)(ch - 32))
                {
                    iCount++;
                }
            }
            else                                            // Other (symbols / digits)
            {
                if (curr == ch)
                {
                    iCount++;
                }
            }
        }

        return iCount;
    }
}

class Program149
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