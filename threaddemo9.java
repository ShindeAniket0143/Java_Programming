class Demo extends Thread
{
    public void run()
    {
        try
        {
            int i = 0;

            for(i = 1; i <= 10; i++)
            {
                System.out.println("Thread is running..."+Thread.currentThread().getName()+" "+i);    
                Thread.sleep(1000);
            }
        }
        catch(Exception eobj)
        {}
    }
}

class threaddemo9
{
    public static void main(String A[]) 
    {
        System.out.println("Inside main thread");
        
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First_Thread");
        dobj2.setName("Second_Thread");

        dobj1.start();
        dobj2.start();
        
        System.out.println("End of main thread");
    }
}