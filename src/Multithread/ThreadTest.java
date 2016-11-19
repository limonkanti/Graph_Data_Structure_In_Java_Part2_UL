
package Multithread;

public class ThreadTest extends Thread
{
    public void run()
    {
        System.out.println("ok thread.....");
    }
    public static void main(String args[]) 
    {
        ThreadTest ob=new ThreadTest();
        ob.start();
        ob.start();
        
    }
    
}
