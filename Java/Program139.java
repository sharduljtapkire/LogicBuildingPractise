/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program139.java
//  Description :   Accept a string from the user and change the lowercase
//                  charcters to '$' in a string.
//  Input       :   InDiA
//  Ouput       :   I$D$A
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

        StringBuilder sb = new StringBuilder(Arr);

        for (int iCnt = 0; iCnt < sb.length(); iCnt++)
        {
            char ch = sb.charAt(iCnt);

            if ((ch >= 'a') && (ch <= 'z'))
            {
                sb.setCharAt(iCnt, '$');   
            }
        }    

        return sb.toString();  
    }
}

class Program139
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
