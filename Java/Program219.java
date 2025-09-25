/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program219.java
//
//  Description : Converts a given decimal number to binary and displays it.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class NumberOperations
{
    public void DisplayBinary(int iNo)
    {
        int iDigit = 0;
        System.out.println("Binary conversion is : ");
        
        if(iNo == 0)
        {
            System.out.println("0");
            return;
        }

        // Using StringBuilder to display binary in correct order
        StringBuilder binary = new StringBuilder();
        while(iNo != 0)
        {
            iDigit = iNo % 2;
            binary.insert(0, iDigit); // prepend the digit
            iNo = iNo / 2;
        }

        System.out.println(binary.toString());
    }
}

public class Program219
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();
        
        NumberOperations obj = new NumberOperations();
        obj.DisplayBinary(iValue);
        
        sobj.close();
    }
}
