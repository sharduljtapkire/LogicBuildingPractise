/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program386.java
//
//  Description : Program to create a fixed-size header string of length 100.
//                - Initial header is "PPA.txt 30".
//                - Pads the header with spaces until its length becomes 100.
//                - Prints the header size before and after update.
//                - Prints the updated header.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program386
{
    public static void main(String A[])
    {
        try
        {
           String Header = "PPA.txt 30";

           System.out.println("Header size is : "+Header.length());

           int i = 0;

           for(i = Header.length(); i < 100; i++)
           {
                Header = Header + " ";
           }

           System.out.println("Header size after update is : "+Header.length());

           System.out.println("Updated header is : "+Header);

        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred : " + eobj);
        }
    }
}
