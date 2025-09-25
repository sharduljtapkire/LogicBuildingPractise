/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program198.java
//
//  Description : Demonstrates writing a string directly to standard output.
//                Equivalent to C program using write(1, "Jay Ganesh...", 13).
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.*;

public class Program198
{
    public static void main(String[] args)
    {
        try
        {
            // Writing directly to standard output using System.out
            String message = "Jay Ganesh...";
            
            // Using OutputStream to mimic write() behavior
            OutputStream out = System.out;
            out.write(message.getBytes());
            out.flush();  // ensure all bytes are written
        }
        catch(IOException e)
        {
            System.out.println("Error while writing: " + e.getMessage());
        }
    }
}
