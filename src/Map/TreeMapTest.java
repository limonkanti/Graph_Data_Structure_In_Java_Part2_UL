
package Map;

import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class TreeMapTest 
{
      public static void main(String args[])
     {
          TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
     
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
