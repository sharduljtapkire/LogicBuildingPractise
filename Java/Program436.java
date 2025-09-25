/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program436.java
//
//  Description : Accepts a string from the user, removes all white spaces,
//                and counts the frequency of each character using HashMap.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class program436
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        // Remove all spaces from the string
        str = str.replaceAll(" ","");

        HashMap<Character, Integer> hobj = new HashMap<Character, Integer>();

        char Arr[] = str.toCharArray();
        int Frequency = 0;

        for(char ch : Arr)
        {
            if(hobj.containsKey(ch))  // Character is already there in hashmap
            {
                Frequency = hobj.get(ch);
                hobj.put(ch, Frequency + 1);
            }
            else    // Character occurred first time
            {
                hobj.put(ch, 1);
            }
        } 

        System.out.println(hobj);
    }
}
