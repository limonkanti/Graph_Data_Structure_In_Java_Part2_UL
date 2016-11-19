
package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class HM_Sort_By_Key 
{
     public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap();
     //   hm.put(null, 1);
      //  hm.put(null, 1);
        hm.put(2, null);
       // hm.put(2, 222);
        hm.put(1, null);
        hm.put(11, null);
        hm.put(3, 3);
        hm.put(4, 3);
        TreeMap<Integer, Integer> tm = new TreeMap(hm);
        System.out.println(tm);
       

    }
    
}
