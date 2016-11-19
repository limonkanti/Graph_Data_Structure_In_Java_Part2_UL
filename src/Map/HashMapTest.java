
package Map;

import java.util.*;  
public class HashMapTest 
{
    public static void main(String args[])
    {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1, "limon");
        hm.put(0, null);
        hm.put(7, null);
        hm.put(5,"Raju");
        hm.put(4, "Nahid");
        hm.remove(0);
        System.out.println(hm);
                
        for(Map.Entry e:hm.entrySet())
        {
            System.out.println(e.getKey()+"\t"+e.getValue());
        }
    }
    
}
