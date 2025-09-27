/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program532.java
//  Description : Simulated CVFS shell input and token counting
//  Author      : Shardul Tapkire
//  Date        : 27/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program532
{
    ///////////////////////////////////////////////////////////////////////////
    //
    //  Entry point function of project (main)
    //
    ///////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int iCount = 0;
        String[] Command = new String[4];

        System.out.println("---------------------------------------------------------");
        System.out.println("--------- Marvellous CVFS Started Successfully ----------");
        System.out.println("---------------------------------------------------------");

        System.out.print("\nMarvellous CVFS > ");
        str = sc.nextLine();

        // Split the input into up to 4 tokens like sscanf in C++
        String[] tokens = str.split("\\s+", 4);

        for(int i = 0; i < 4; i++)
        {
            if(i < tokens.length)
            {
                Command[i] = tokens[i];
            }
            else
            {
                Command[i] = "";
            }
        }

        iCount = tokens.length;

        System.out.println("Number of tokens are : " + iCount);
        
        sc.close();
    }
}
