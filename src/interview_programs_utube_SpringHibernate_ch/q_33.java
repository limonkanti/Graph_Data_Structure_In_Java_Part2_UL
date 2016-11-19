
package interview_programs_utube_SpringHibernate_ch;

import java.util.*;

public class q_33 
{
     public static void main(String[] args)
     {
         Map<Integer,String> m=new HashMap<Integer,String>();
         m.put(2, "B");
         m.put(3, "C");
         m.put(1, "A");
         Map<Integer,String> tm=new TreeMap<Integer,String>(m);
         System.out.println(tm);
         
     }
    
    
}
