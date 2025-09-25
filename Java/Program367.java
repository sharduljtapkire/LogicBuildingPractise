/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program367.java
//
//  Description : Program to display the name and size of a file.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program367
{
    public static void main(String A[]) throws Exception
    {
        File fobj = new File("Marvellous.txt");
        System.out.println("File name is : "+fobj.getName());
        System.out.println("File size is : "+fobj.length());
    }
}
