/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program389.java
//
//  Description : Program to demonstrate trimming of a string that contains
//                leading and trailing spaces. It displays the original length
//                of the string, trims spaces, and then displays the updated length.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program389
{
    public static void main(String A[])
    {
        try
        {
            String str = "     Marvellous Infosystems Pune     ";

            System.out.println("Original length : "+str.length());

            str = str.trim();

            System.out.println("Updated length : "+str.length());
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred : " + eobj);
        }
    }
}
