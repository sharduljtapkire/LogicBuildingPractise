/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program192.java
//
//  Description : Demonstrates how to open an existing file in Java and 
//                append the string "India is my country" to it.
//                Equivalent to using open() with O_RDWR | O_APPEND in C.
//                If the file cannot be opened, an error message is displayed.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

public class Program192
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;

        try {
            System.out.println("Enter the file name that you want to open : ");
            String fileName = sc.nextLine();

            File file = new File(fileName);

            if(!file.exists()) {
                System.out.println("Unable to open file");
                return;
            }

            // Open file for writing in append mode
            fos = new FileOutputStream(file, true);  // true = append

            String buffer = "India is my country";
            byte[] data = buffer.getBytes();

            fos.write(data);

            System.out.println(data.length + " bytes gets written successfully");
        } 
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
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
