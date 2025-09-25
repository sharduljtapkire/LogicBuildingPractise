/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program390.java
//
//  Description : Program to demonstrate trimming of a string and splitting it
//                into tokens based on spaces. It displays the original length,
//                trimmed length, and the number of tokens in the string.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program390
{
    public static void main(String A[])
    {
        try
        {
            String str = "     Marvellous Infosystems Pune     ";

            System.out.println("Original length : "+str.length());

            str = str.trim();

            System.out.println("Updated length : "+str.length());

            String Arr[] = str.split(" ");

            System.out.println("Number of tokens : "+Arr.length);
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred : " + eobj);
        }
    }
}
