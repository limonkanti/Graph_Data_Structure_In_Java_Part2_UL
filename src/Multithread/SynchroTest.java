
package Multithread;
class Table
{
   static synchronized void print(int n)
    {
        for(int i=1;i<=n;i++)
        {
             System.out.println(i);
        }
       
    }
}
class MyThred extends Thread
{
    public void run()
    {
       // Table ob=new Table();
       // ob.print(5);
        
        Table.print(5);
    }
}
class MyThred1 extends Thread
{
    public void run()
    {
       Table.print(10);
       // Table ob=new Table();
      //  ob.print(10);
    }
}


public class SynchroTest
{
    public static void main(String[] args) 
    {
        MyThred ob=new MyThred();
        MyThred1 ob1=new MyThred1();
        ob.start();
        ob1.start();
        
    }
    
    
}
