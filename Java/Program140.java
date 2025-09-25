/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program140.java
//  Description :   Accept a string from the user and convert all lowercase
//                  characters to uppercase in the string.
//  Input       :   InDiA
//  Output      :   INDIA
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public String Change(String Arr)   // return updated string
    {
        if (Arr == null)
        {
            System.out.println("Invalid input.");
            return "";
        }

        String result = "";

        for (int iCnt = 0; iCnt < Arr.length(); iCnt++)
        {
            char ch = Arr.charAt(iCnt);

            if ((ch >= 'a') && (ch <= 'z'))
            {
                result = result + (char)(ch - 32);   
            }
            else
            {
                result = result + ch;
            }
        }    

        return result;  
    }
}

class Program140
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String Str = sobj.nextLine();

        StringX sxobj = new StringX();
        String Updated = sxobj.Change(Str);

        System.out.println("Updated String Is : " + Updated);
    }
}
