/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program157.java
//  Description :   Accept a string from user and display it in reverse
//                  using manual length calculation and while loop.
//
//  Input Demo: 
//      String : Hello
//      Output : olleH
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public void ReverseDisplay(String str)
    {
        int iCount = 0;
        int iCnt = 0;

        // Calculate length manually
        while (iCount < str.length())
        {
            iCount++;
        }

        // Start from last character
        iCnt = iCount - 1;

        // Display in reverse using while loop
        while (iCnt >= 0)
        {
            System.out.print(str.charAt(iCnt));
            iCnt--;
        }
        System.out.println();
    }
}

class Program157
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String Arr = sobj.nextLine();

        StringX sx = new StringX();
        sx.ReverseDisplay(Arr);
    }
}