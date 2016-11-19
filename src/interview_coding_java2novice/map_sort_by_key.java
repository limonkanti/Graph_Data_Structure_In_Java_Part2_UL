
package interview_coding_java2novice;

import java.util.*;


public class map_sort_by_key 
{
    
    
    public static void main(String[] args) {
         HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
         hm.put(3,"limon");
         hm.put(1, "ajib");
         hm.put(2, "b");
         
         Map<Integer,String> hm2=new TreeMap<Integer,String>(hm); 
         System.out.println("Before Sorting:\t");
         for(Map.Entry m:hm2.entrySet())
         {
             System.out.println(m.getKey()+" \t "+m.getValue());
         }
         
         
         Map<Integer,String> hm1=new TreeMap<Integer,String>(hm); 
       
         System.out.println("After Sorting:\t");
         for(Map.Entry m:hm1.entrySet())
         {
             System.out.println(m.getKey()+" \t "+m.getValue());
         }
    }
    
}
