
package List_ArrayList;

import java.util.*;


public class SubListTest 
{
    public static void main(String args[])
    {
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        
        int ar[]=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            ar[i]=l.get(i);
          
        }
       for(int x:ar)
       {
           System.out.println(x);
       }
    
        
     }
    
}
