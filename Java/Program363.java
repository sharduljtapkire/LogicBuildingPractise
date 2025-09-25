/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program363.java
//
//  Description : Program to create a new file named "Marvellous.txt" using Java.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program363
{
    public static void main(String A[]) throws Exception
    {
        File fobj = new File("Marvellous.txt");

        fobj.createNewFile();
    }
}
