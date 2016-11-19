
package Set;

import java.util.*;


public class HashSet2Array
{
    public static void main(String[] args) 
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(2);
        hs.add(22);
        hs.add(222);
        hs.add(2222);
        
       Integer ar[]=new Integer[hs.size()];
       hs.toArray(ar);
       for(int i=0;i<ar.length;i++)
       {
           System.out.println(ar[i]);
       }
       
        
        
    }
    
}
