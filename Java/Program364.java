/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program364.java
//
//  Description : Program to create a new file named "Marvellous.txt" with
//                proper exception handling using Java.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program364
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("Marvellous.txt");
            fobj.createNewFile();  
        }
        catch(IOException iobj)
        {
        }
        catch(Exception eobj)
        {
        }
    }
}
