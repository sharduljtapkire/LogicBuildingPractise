/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program141.java
//  Description :   Accept a string from the user and convert all characters
//                  to lowercase.
//  Input       :   InDiA
//  Output      :   india
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public String toLowerX(String str)
    {
        if (str == null)
        {
            return "";
        }

        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if ((ch >= 'A') && (ch <= 'Z'))  
            {
                ch = (char)(ch - ('a' - 'A'));   
            }

            result = result + ch;
        }

        return result;
    }
}

class Program141
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String input = sobj.nextLine();

        StringX sx = new StringX();
        String updated = sx.toLowerX(input);

        System.out.println("Updated string : " + updated);
    }
}
