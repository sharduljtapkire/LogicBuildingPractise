/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program444.java
//
//  Description : Accepts a string from the user, removes extra spaces between 
//                words, and counts the number of words in the updated string.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program444
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");

        String str = sobj.nextLine();

        // Remove leading and trailing spaces
        str = str.trim();

        char Arr[] = str.toCharArray();
        char Brr[] = new char[Arr.length];
        
        int iCount = 0, i = 0, j = 0;
        boolean bFlag = false;

        // Copy characters, keeping only one space between words and count spaces
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] != ' ')
            {
                Brr[j] = Arr[i];
                j++;
                bFlag = false;
            }
            else if(Arr[i] == ' ')
            {
                if(bFlag == false)
                {
                    Brr[j] = ' ';
                    j++;
                    bFlag = true;
                    iCount++;  // count spaces as word separators
                }
            }
        }
        
        // Number of words = number of spaces + 1
        System.out.println("Number of words are : "+(iCount+1));
    }
}
