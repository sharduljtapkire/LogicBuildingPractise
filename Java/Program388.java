/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program388.java
//
//  Description : Program to demonstrate trimming of a string. It displays
//                the original length of the string, trims leading and trailing
//                spaces, and then displays the updated length.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program388
{
    public static void main(String A[])
    {
        try
        {
            String str = "Marvellous Infosystems Pune";

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
