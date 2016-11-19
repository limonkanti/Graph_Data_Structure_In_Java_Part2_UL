package Multithread;

public class ReentrantTest {

    public synchronized void m() {
        n();
        System.out.println("this is m() method");
    }

    public synchronized void n() {
        System.out.println("this is n() method");
    }
    public static void main(String[] args) 
    {
        ReentrantTest ob=new ReentrantTest();
        Thread t1=new Thread()
        {
           public void run()
           {
               ob.m();
           }
        };
        t1.start();
        
    }

}
