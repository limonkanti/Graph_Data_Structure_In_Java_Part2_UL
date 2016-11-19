package Map;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap();
        hm.put(null, 1);
        hm.put(null, 1);
        hm.put(2, null);
        hm.put(2, 222);
        hm.put(1, null);
         hm.put(11, null);
        hm.put(3, 3);
        hm.put(4, 3);
        // traverse process 1....
        for (Map.Entry em : hm.entrySet()) {
            System.out.println(em.getKey() + "\t" + em.getValue());
        }
        // traverse process 2....
        Set<Entry<Integer, Integer>> s=hm.entrySet();
        for(Entry<Integer, Integer> e:s)
        {
            System.out.println(e.getKey()+"\t"+e.getValue());
            
        }
        System.out.println("Get Value using key");
        System.out.println(hm.get(2));
        
       TreeMap<Integer, Integer> tm = new TreeMap();
    //    tm.put(null, 1);
      //  tm.put(null, 1);
     //   tm.put(2, null);
     //   tm.put(2, 222);
     //   tm.put(1, null);
      //  tm.put(11, null);
       tm.put(1, 3);
        tm.put(2, 3);
        tm.put(3, 3);
        tm.put(4, 3);
        
         SortedMap<Integer, Integer> tm2=tm.subMap(1,2);
         System.out.println(tm2);
         

    }

}
