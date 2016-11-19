
package list_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_stack 
{
     public static void main(String args[])
    {
     
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.push(1);
        l.push(2);
        l.push(3);
        l.add(null);
        System.out.println("Before Elements are:\t"+l.lastIndexOf(2));
       System.out.println("Before Elements are:\t"+l.getFirst());
        System.out.println("Before Elements are:\t"+l.get(1));
        System.out.println("Before Elements are:\t"+l);
        l.pop();
        System.out.println(l);
        
    }
    
}
