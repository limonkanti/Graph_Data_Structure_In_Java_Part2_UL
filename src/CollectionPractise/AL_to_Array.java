
package CollectionPractise;

import java.util.*;


public class AL_to_Array 
{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(11);
        Object ob[]=al.toArray();
        for(Object x:ob)
        {
            System.out.println(x);
        }
        
    }
    
}
