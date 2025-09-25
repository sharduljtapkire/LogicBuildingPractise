/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program128.java
//  Description :   Accept a full name from the user and display it on the screen.
//  Author      :   Shardul Tapkire
//  Date        :   04/08/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class StringX
{
    public void Display(String Arr)
    {
        System.out.println("Your Name Is : "+Arr);
    }
}
class Program128
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Name :");
        String Name = sobj.nextLine();

        StringX sxobj = new StringX();
        sxobj.Display(Name);
    }
}