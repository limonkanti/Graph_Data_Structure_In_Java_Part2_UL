
package OOPS;

import java.util.ArrayList;
import java.util.List;


public class WildCardTest 
{
   
    public static void main(String args[])
    {
        
       List<?> l=null;
       List<Double> ld=new ArrayList<Double>();
        List<Double> ll=ld;
        ll.add(1.11);
        System.out.println(ll);
        //List<Object> obj=ld;
       l=ld;
       ld.add(1.1);
       System.out.println(ld);
       
    }
    
}
