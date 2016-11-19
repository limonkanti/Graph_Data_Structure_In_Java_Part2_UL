
package list_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JoinArrayList_withLinked
{
     public static void main(String args[])
    {
     
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.removeFirst();
        l.removeLast();
        System.out.println("Before Elements are:\t"+l);
        LinkedList<Integer> l2=new LinkedList<Integer>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(4);
        l.addAll(al);
    }
    
}
