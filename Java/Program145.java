/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program145.java
//  Description :   Accept a string and a character from user and count 
//                  frequency of that character (case-sensitive).
//  Input       :   Hello World
//                  o
//  Output      :   o occurs 2 times
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
            if (str.charAt(i) == ch)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class Program145
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
