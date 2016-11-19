
package Multithread;


public class ThreadGrouptest implements Runnable{

    public void run() 
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) 
    {
        
        ThreadGrouptest ob=new ThreadGrouptest();
        ThreadGroup tg=new ThreadGroup("Groupe---1");
        Thread t1=new Thread(tg,ob,"one");
        t1.start();
        Thread t2=new Thread(tg,ob,"two");
        t2.start();
        Thread t3=new Thread(tg,ob,"three");
        t3.start();
        System.out.println(tg.getName());
        tg.list();
    }
    
}
