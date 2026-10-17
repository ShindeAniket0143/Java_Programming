import java.util.*;

class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}

class exceptiondemo4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int Age = 0;

        System.out.println("Enter Your Age : ");
        Age = sobj.nextInt();

        try
        {
            if(Age < 18)
            {
                throw new AgeInvalid("Your are under age");
            }
            else
            {
                System.out.println("Welcome to __________ ");
            }
        }
        catch(AgeInvalid aobj)
        {
            System.out.println("Exception occured due to age");
        }
    }
}