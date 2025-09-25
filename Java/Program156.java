/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program156.java
//  Description :   Accept a string from user and display it in reverse
//                  using manual length calculation.
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

        // Calculate length manually
        for (int i = 0; i < str.length(); i++)
        {
            iCount++;
        }

        // Display in reverse
        for (int iCnt = iCount - 1; iCnt >= 0; iCnt--)
        {
            System.out.print(str.charAt(iCnt));
        }
        System.out.println();
    }
}

class Program156
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
