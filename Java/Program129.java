/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program129.java
//  Description :   Accept a string from the user and display each character
//                  of the string.
//  Author      :   Shardul Tapkire
//  Date        :   04/08/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class StringX
{
    public void Display(String Arr)
    {
        int iCnt = 0;

        for(iCnt = 0 ; iCnt < Arr.length() ; iCnt++)
        {
            System.out.println(Arr.charAt(iCnt));
        }
    }
}
class Program129
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String Str = sobj.nextLine();

        StringX sxobj = new StringX();
        sxobj.Display(Str);
    }
}