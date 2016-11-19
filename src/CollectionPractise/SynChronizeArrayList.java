
package CollectionPractise;

import java.util.*;


public class SynChronizeArrayList 
{
    public static void main(String[] args) {
        List<Integer> li=new ArrayList();
        li.add(1);
        li.add(11);
        li.add(111);
        ArrayList<Integer> al=new ArrayList();
        Collections.synchronizedList(al);
        System.out.println(li);
        
    }
    
}
