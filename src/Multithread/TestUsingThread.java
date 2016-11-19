
package Multithread;

public class TestUsingThread extends Thread
{
    public void run()
    {
       // System.out.println("Thread");
        for(int i=1;i<=2;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
                        
            }
            System.out.println(i);
        }
        
    }
    
    public static void main(String args[])
    {
        TestUsingThread ob=new TestUsingThread();
          TestUsingThread ob1=new TestUsingThread();
       // ob.run1();
        ob.start();
        ob1.start();
    }
    
}
