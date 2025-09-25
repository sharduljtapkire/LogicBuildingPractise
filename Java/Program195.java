/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program195.java
//
//  Description : Demonstrates how to open a file in Java, read a specific number
//                of bytes (first 11 bytes, then 20 bytes) in separate reads by 
//                reopening the file each time. Equivalent to multiple open() 
//                and read() calls in C.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

public class Program195
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the file name that you want to open : ");
            String fileName = sc.nextLine();

            File file = new File(fileName);

            if (!file.exists()) {
                System.out.println("Unable to open file. File does not exist.");
                return;
            }

            // First read: 11 bytes
            FileInputStream fis1 = new FileInputStream(file);
            System.out.println("File is successfully opened (first read), pseudo FD: " + fis1.hashCode());

            byte[] buffer1 = new byte[11];
            int bytesRead1 = fis1.read(buffer1, 0, buffer1.length);
            System.out.println(bytesRead1 + " bytes gets read successfully");
            System.out.println("Data from file is : " + new String(buffer1, 0, bytesRead1));

            fis1.close();

            // Second read: 20 bytes
            FileInputStream fis2 = new FileInputStream(file);
            System.out.println("File is successfully opened (second read), pseudo FD: " + fis2.hashCode());

            byte[] buffer2 = new byte[20];
            int bytesRead2 = fis2.read(buffer2, 0, buffer2.length);
            System.out.println(bytesRead2 + " bytes gets read successfully");
            System.out.println("Data from file is : " + new String(buffer2, 0, bytesRead2));

            fis2.close();

        } catch(IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
}
