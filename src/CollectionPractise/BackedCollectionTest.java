
package CollectionPractise;

import java.util.*;


public class BackedCollectionTest 
{
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<String, String>();
        SortedMap<String, String> sm=tm.subMap("d","h");
        tm.put("d", "dog");
        tm.put("c", "cat");
        tm.put("h", "horse");
        System.out.println(sm);
        System.out.println(tm);
        tm.put("e", "ent");
        System.out.println(sm);
        System.out.println(tm);
        
        List<Integer> l=new ArrayList();
        l.add(1);
        l.add(2);
        l.add(4);
        Arrays.asList(l);
        
    }
}
