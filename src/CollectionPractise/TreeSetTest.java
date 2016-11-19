
package CollectionPractise;

import java.util.*;


public class TreeSetTest 
{
    public static void main(String[] args)
    {
        SortedSet ss=new TreeSet();
        ss.add(11);
        ss.add(1111);
        ss.add(1);
      //  Iterator itr1=ss.iterator();
        //ss.add(null);     
       // ss.add(null);   
       // System.out.println(ss.last());
        System.out.println("Sorted implement\t"+ss);
        NavigableSet ns=new TreeSet();
        ns.add(22);
        ns.add(222);
        ns.add(2);
       // Iterator itr=ns.descendingIterator();
       // while(itr.)
        
       // ns.add(null);  
       // ns.add(null);        
        System.out.println("Navigable implement\t"+ns);
        HashSet<Integer> hs=new HashSet();
        hs.add(3);
        hs.add(4);
        hs.add(3);
        hs.add(null);
        hs.add(null);
        hs.add(1);
        hs.add(2);
        
        System.out.println("Hashset\t"+hs);
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(2);
        lhs.add(1);
        lhs.add(2);
        lhs.add(null);
        lhs.add(null);
        System.out.println("LinkedHashset\t"+lhs);
        ArrayList ll=new ArrayList();
        ll.add(1);
        System.out.println(ll.get(0));
       
        
    }
    
}
