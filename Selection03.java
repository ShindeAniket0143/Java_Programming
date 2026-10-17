import java.util.*;

class Selection03
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int No = 0;

        System.out.println("Enter Your Age : ");
        No = sobj.nextInt();

        if (No < 18) 
        {
            System.out.println("Not Allowed");    
        }

        else
        {
            System.out.println("Allowed");
        }
    }
}