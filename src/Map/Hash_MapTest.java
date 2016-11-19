
package Map;

import java.util.*;

public class Hash_MapTest 
{
     public static void main(String args[])
     {
          HashMap<Integer,String> hm=new HashMap<Integer,String>();
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
          Set set=hm.entrySet();
          Iterator itr=set.iterator();
          while(itr.hasNext())
          {
              Map.Entry me=(Map.Entry)itr.next();
              System.out.println(me.getKey()+"\t"+me.getValue());
          }
          hm.remove(null);
          hm.remove(null);
          hm.remove(null);
          System.out.println(hm);
     }
    
}
