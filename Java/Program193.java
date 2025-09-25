/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program193.java
//
//  Description : Demonstrates how to create a file if it does not exist,
//                open it for writing, and append data to it.
//                Equivalent to using open() with O_CREAT | O_WRONLY | O_APPEND in C.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

public class Program193
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;

        try {
            System.out.println("Enter the file name that you want to open : ");
            String fileName = sc.nextLine();

            File file = new File(fileName);

            // FileOutputStream in append mode will create the file if it does not exist
            fos = new FileOutputStream(file, true);  // true = append

            System.out.println("File is successfully opened/created with pseudo FD: " + fos.hashCode());

            String buffer = "India is my country";
            byte[] data = buffer.getBytes();

            fos.write(data);

            System.out.println(data.length + " bytes gets written successfully");
        } 
        catch(IOException e) {
            System.out.println("Unable to open or write to file: " + e.getMessage());
        } 
        finally {
            try {
                if(fos != null) fos.close();
            } catch(IOException e) {
                // ignore
            }
        }
    }
}
