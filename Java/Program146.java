/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program146.java
//  Description :   Accept a string and a character from user and count 
//                  frequency of that character (case-insensitive).
//  Input       :   Hello World
//                  h
//  Output      :   h occurs 1 times
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

            // Check case-insensitive match
            if (curr == ch || curr == (char)(ch + 32) || curr == (char)(ch - 32))
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class Program146
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
