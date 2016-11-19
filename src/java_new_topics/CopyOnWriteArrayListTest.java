
package java_new_topics;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class CopyOnWriteArrayListTest 
{
    public static void main(String[] args)
    {
        
        CopyOnWriteArrayList<Integer> al=new CopyOnWriteArrayList<Integer>();
        al.add(1);
        al.add(1);
        al.add(11);
        Iterator itr=al.iterator();
        al.add(11);
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
     //   al.remove(1);
        
        
        
    }
    
}
