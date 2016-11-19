
package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class LinkedMapTest 
{
     public static void main(String args[])
     {
         LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
          hm.put(null, null);
          hm.put(null, null);
          hm.put(null, null);
          hm.put(11, "A");
          hm.put(11, "A");
          hm.put(2, null);
          hm.put(3, null);
          hm.put(4, "B");
          System.out.println(hm);
          for(Map.Entry e:hm.entrySet())
          {
              System.out.println(e.getKey()+"\t"+e.getValue());
          }
         
     }
    
}
