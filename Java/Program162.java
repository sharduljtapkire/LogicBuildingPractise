/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program162.java
//  Description :   Accept a string from user and check whether it is a palindrome
//                  using start and end indexes, and final check to determine result.
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
        char[] arr = str.toCharArray();
        int start = 0;
        int end = 0;

        // Find end of string
        end = arr.length - 1;

        // Compare characters from start and end
        while (start < end)
        {
            if (arr[start] != arr[end])
            {
                break;
            }
            start++;
            end--;
        }

        // If start < end, mismatch found → not palindrome
        if (start < end)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class Program162
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