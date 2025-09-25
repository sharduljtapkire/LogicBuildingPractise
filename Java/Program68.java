class Patterns
{
    void Display()
    {
        int i = 0 , j = 0;

        for(i = 1 ; i <= 3 ; i++)
        {
            for(j = 1 ; j <= 3 ; j++)
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
class Program68
{
    public static void main(String A[]) 
    {
        Patterns pobj = new Patterns();
        pobj.Display();     
    }
}