
package list_LinkedList;

import java.util.LinkedList;

public class LinkedList_queue 
{
      public static void main(String args[])
    {
     
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.offer(1);
        l.offer(2);
        l.offer(3);
        System.out.println("Before Elements are:\t"+l);
        l.poll();
        System.out.println(l);
        
    }
    
}
