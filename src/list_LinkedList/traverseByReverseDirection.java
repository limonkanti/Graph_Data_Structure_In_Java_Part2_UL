
package list_LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.*;

public class traverseByReverseDirection 
{
    public static void main(String args[])
    {
     
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println("Before Elements are:\t"+l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Reverse Order"+l);
        /*
        
        Iterator i=l.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        } 
        
        
        */
    }
    
}
