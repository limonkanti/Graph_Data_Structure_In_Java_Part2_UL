
package list_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedList_2_Array 
{
    
       public static void main(String args[])
    {
     
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        int a[]=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            a[i]=l.get(i);
            
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
            
        }
        
        //System.out.println(list);
        
        
    }
}
