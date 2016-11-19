
package Java8;

import java.util.ArrayList;
import java.util.List;


public class MethodReferences
{
     public static void main(String args[])
     {
         List<Integer> l=new ArrayList<Integer>();
         l.add(1);
         l.add(2);
         l.forEach(System.out::println);
     }
    
}
