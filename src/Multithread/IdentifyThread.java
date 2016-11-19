package Multithread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IdentifyThread extends Thread{
    public void run()
    {
        System.out.println("Code...........");
    }
    
 public static void main(String[] args)
    {
        IdentifyThread ob=new IdentifyThread();
        ob.start();
        System.out.println(ob.isAlive()); 
        System.out.println(ob.isAlive()); 
    }


}
