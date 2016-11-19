
package Data_Structure;

import java.util.Iterator;
import java.util.LinkedList;


public class TraverseLinkedL 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        Iterator itr=l.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
            
        }
        
    }
    
}
