
package Data_Structure;

import java.util.*;


public class DQueueTest 
{
    //Deque is an interface//We can implement it by using ArrayDeque and LinkedList//
    public static void main(String[] args) 
    {
        Deque d=new LinkedList();
        d.add(1);
        d.add(2);
        d.add(3);
        Iterator ite=d.iterator();
        while(ite.hasNext())
        {
            System.out.println(ite.next());
        }
     
        
    }
    
}
