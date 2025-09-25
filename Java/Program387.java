/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program387.java
//
//  Description : Program to create a fixed-size header string of length 100,
//                pad it with spaces, display its size and content, then trim
//                the spaces and display the updated size and content.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program387
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

           Header = Header.trim();

           System.out.println("Header size after trim is : "+Header.length());
           System.out.println("Updated header after trim is : "+Header);
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred : " + eobj);
        }
    }
}
