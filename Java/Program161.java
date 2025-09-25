/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program161.java
//  Description :   Accept a string from user and check whether it is a palindrome
//                  using start and end pointers (simulated via indexes).
//
//  Input Demo 1: 
//      String : level
//      Output : String is palindrome
//
//  Input Demo 2: 
//      String : hello
//      Output : String is not palindrome
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public boolean CheckPallindrome(String str)
    {
        int start = 0;
        int end = 0;
        boolean bFlag = true;

        // Convert string to char array to simulate pointer arithmetic
        char[] arr = str.toCharArray();

        // Find end of string
        end = arr.length - 1;

        // Compare characters from start and end
        while (start < end)
        {
            if (arr[start] != arr[end])
            {
                bFlag = false;
                break;
            }
            start++;
            end--;
        }

        return bFlag;
    }
}

class Program161
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String Arr = sobj.nextLine();

        StringX sx = new StringX();
        boolean bRet = sx.CheckPallindrome(Arr);

        if (bRet)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}
