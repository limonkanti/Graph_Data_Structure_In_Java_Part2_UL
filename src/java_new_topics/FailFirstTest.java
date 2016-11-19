
package java_new_topics;

import java.util.Iterator;
import java.util.TreeSet;

public class FailFirstTest
{
    
    public static void main(String[] args) {
         TreeSet<Object> t=new TreeSet<Object>();
        t.add(1111111);
        t.add(333333);
         Iterator it=t.iterator();
         t.add(5555);
         while(it.hasNext())
         {
              System.out.println(it.next());
         }
    }
}
