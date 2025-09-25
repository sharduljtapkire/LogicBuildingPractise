/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program143.java
//  Description :   Accept a string from the user and toggle the case of all
//                  alphabetic characters (lowercase <-> uppercase).
//  Input       :   InDiA
//  Output      :   iNdIa
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public String toggleCase(String str)
    {
        if (str == null)
        {
            return "";
        }

        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if ((ch >= 'a') && (ch <= 'z'))
            {
                ch = (char)(ch - 32);  // to uppercase
            }
            else if ((ch >= 'A') && (ch <= 'Z'))
            {
                ch = (char)(ch + 32);  // to lowercase
            }

            result = result + ch;
        }

        return result;
    }
}

class Program143
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String Str = sobj.nextLine();

        StringX sx = new StringX();
        String Updated = sx.toggleCase(Str);

        System.out.println("Updated string : " + Updated);
    }
}
