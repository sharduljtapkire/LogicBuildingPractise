import java.util.Scanner;

class Patterns
{
    void Display(int iRow , int iCol)
    {
        int i = 0 , j = 0;

        for(i = 1 ; i <= iRow ; i++)
        {
            for(j = 1 ; j <= iCol ; j++)
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
class Program69
{
    public static void main(String A[]) 
    {
        int iValue1 = 0 , iValue2 = 0 ;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Number Of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter The Number Of Coloumns : ");
        iValue2 = sobj.nextInt();

        Patterns pobj = new Patterns();
        pobj.Display(iValue1,iValue2);     
    }
}