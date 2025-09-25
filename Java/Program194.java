/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program194.java
//
//  Description : Demonstrates how to open an existing file in Java for reading,
//                read a specific number of bytes (11 bytes), and display the data.
//                Equivalent to using open() with O_RDONLY and read() in C.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

public class Program194
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

            FileInputStream fis = new FileInputStream(file);

            System.out.println("File is successfully opened with pseudo FD: " + fis.hashCode());

            byte[] buffer = new byte[11];
            int bytesRead = fis.read(buffer, 0, buffer.length);

            System.out.println(bytesRead + " bytes gets read successfully");

            String data = new String(buffer, 0, bytesRead);
            System.out.println("Data from file is : " + data);

            fis.close();
        } 
        catch(IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
}
