/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program152.java
//  Description :   Accept a string and a character from user and check 
//                  whether the character is present in the string.
//  Input Demo 1: 
//      String : Hello
//      Char   : e
//      Output : e is present in Hello
//
//  Input Demo 2: 
//      String : World
//      Char   : z
//      Output : z is not present in World
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public boolean CheckCharacter(String str, char ch)
    {
        boolean bFlag = false;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }
}

class Program152
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the character : ");
        char cValue = sobj.next().charAt(0);

        StringX sx = new StringX();
        boolean bRet = sx.CheckCharacter(Arr, cValue);

        if (bRet)
        {
            System.out.println(cValue + " is present in " + Arr);
        }
        else
        {
            System.out.println(cValue + " is not present in " + Arr);
        }
    }
}
