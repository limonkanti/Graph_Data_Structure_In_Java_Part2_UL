
package java_new_topics;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;


public class CopyOnWriteArraySetTest 
{
     public static void main(String[] args)
    {
        
        CopyOnWriteArraySet<Integer> al=new CopyOnWriteArraySet<Integer>();
        al.add(1);
        al.add(1);
        al.add(11);
        Iterator itr=al.iterator();
        al.add(12);
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
     //   al.remove(1);
        
        
        
    }
    
    
}
