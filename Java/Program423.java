/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program423.java
//
//  Description : Removes all white spaces from a string using replaceAll() method
//                and prints the updated string along with its length.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class program423
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        // Remove all spaces from the string
        String sRet = str.replaceAll(" ","");

        System.out.println("Updated string is : " + sRet);
        System.out.println("String length is : " + sRet.length());
    }
}
