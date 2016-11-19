
package List_Vector;

import java.util.*;


public class Vector_2_List 
{
      public static void main(String args[])
    {
     
        Vector<Integer> v=new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        List<Integer> l=new ArrayList<Integer>(v);
       
        for(int x:l)
        {
            System.out.println(x);
            
        }
        
        
    }
    
}
