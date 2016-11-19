package Map;

import java.util.*;
import java.util.Map;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Integer, Integer> hm = new TreeMap();
     //   hm.put(null, 1);
      //  hm.put(null, 1);
        hm.put(2, null);
        hm.put(2, 222);
        hm.put(1, null);
        hm.put(11, null);
        hm.put(3, 3);
        hm.put(4, 3);
        for (Map.Entry em : hm.entrySet()) {
            System.out.println(em.getKey() + "\t" + em.getValue());
        }

    }

}
