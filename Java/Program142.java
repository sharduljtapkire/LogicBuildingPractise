/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program142.java
//  Description :   Accept a string from the user and convert all characters
//                  to uppercase.
//  Input       :   InDiA
//  Output      :   INDIA
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public String toUpperX(String str)
    {
        if (str == null)
        {
            return "";
        }

        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if ((ch >= 'a') && (ch <= 'z'))   // lowercase range
            {
                ch = (char)(ch - ('a' - 'A'));   // convert to uppercase
            }

            result = result + ch;
        }

        return result;
    }
}

class Program142
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String input = sobj.nextLine();

        StringX sx = new StringX();
        String updated = sx.toUpperX(input);

        System.out.println("Updated string : " + updated);
    }
}
