/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program435.java
//
//  Description : Accepts a string from the user and removes all white spaces.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class program435
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        // Remove all spaces from the string
        str = str.replaceAll(" ","");

        System.out.println(str);
    }
}
