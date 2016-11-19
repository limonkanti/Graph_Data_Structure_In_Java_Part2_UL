
package java_new_topics;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHM
{
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> hm=new ConcurrentHashMap<Integer,Integer>();
        hm.put(1, 1);
        hm.put(2, 2);
        hm.put(3, 3);
        Iterator itr=hm.keySet().iterator();
        hm.put(4, 4);
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
}
