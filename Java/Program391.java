/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program391.java
//
//  Description : Program to demonstrate trimming of a string, splitting it
//                into tokens, displaying the number of tokens, and printing
//                each token individually.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program391
{
    public static void main(String A[])
    {
        try
        {
            String str = "     Marvellous Infosystems Pune by Piyush Manohar Khairnar     ";

            System.out.println("Original length : "+str.length());

            str = str.trim();

            System.out.println("Updated length : "+str.length());

            String Arr[] = str.split(" ");

            System.out.println("Number of tokens : "+Arr.length);

            int i = 0;

            for(i = 0; i < Arr.length; i++)
            {
                System.out.println(Arr[i]);
            }
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred : " + eobj);
        }
    }
}
