
package Set;

import java.util.*;


public class Traverse 
{
    public static void main(String args[]) {
      // HashSet declaration
      HashSet<String> hset = 
               new HashSet<String>();

      // Adding elements to the HashSet
      hset.add("Apple");
      hset.add("Mango");
      hset.add("Grapes");
      hset.add("Orange");
      hset.add("Fig");
      //Addition of duplicate elements
      hset.add("Apple");
      hset.add("Mango");
      //Addition of null values
      hset.add(null);
      hset.add(null);
      //hset.clear();
      //Displaying HashSet elements
   
          System.out.println(hset);
     
     TreeSet<Integer> tset = 
               new TreeSet<Integer>();
     tset.add(2);
     tset.add(2);
     //tset.add(null);//hashSet not allowed null
      tset.add(1);
      tset.add(1);
      System.out.println(tset);
        LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
        l.add(2);
        l.add(1);
        l.add(2);
        l.add(1);
        l.add(null);
        System.out.println(l);
        
     
    }
    
}
