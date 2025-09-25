/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program385.java
//
//  Description : Program to display the size of a given header string.
//                - Header string is defined as "PPA.txt 30".
//                - Prints the length of the header string.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program385
{
    public static void main(String A[])
    {
        try
        {
           String Header = "PPA.txt 30";

           System.out.println("Header size is : "+Header.length());
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred : " + eobj);
        }
    }
}
