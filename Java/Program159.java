/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program159.java
//  Description :   Accept a string from user and reverse it in-place
//                  using two pointers (start and end).
//
//  Input Demo: 
//      String : Hello
//      Output : olleH
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public void strrevX(char[] str)
    {
        int start = 0;
        int end = 0;
        char temp;

        // Find end of string
        while (end < str.length && str[end] != '\0')
        {
            end++;
        }
        end--; // point to last character

        // Swap characters until start < end
        while (start < end)
        {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }
    }
}

class Program159
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String Arr = sobj.nextLine();

        // Convert to char array for in-place reversal
        char[] arrChars = new char[Arr.length() + 1]; // +1 to simulate '\0'
        for (int i = 0; i < Arr.length(); i++)
        {
            arrChars[i] = Arr.charAt(i);
        }
        arrChars[Arr.length()] = '\0'; // simulate null terminator

        StringX sx = new StringX();
        sx.strrevX(arrChars);

        // Convert back to string ignoring '\0'
        String reversed = new String(arrChars).trim().replace("\0", "");
        System.out.println("String after reversal : " + reversed);
    }
}