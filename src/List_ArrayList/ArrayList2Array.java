
package List_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;


public class ArrayList2Array 
{
    public static void main(String args[]) 
     {
         int a[]={1,2,3,4,5};
         ArrayList l=new ArrayList();
         for(int i=0;i<a.length;i++)
         {
             l.add(a[i]);
         }
         System.out.println(l);
         ArrayList l2=new ArrayList();
         l2.addAll(l);
         int b[] =new int[l2.size()];
         for(int i=0;i<l2.size();i++)
         {
             b[i]=(int) l2.get(i);
         }
         for(int x:b)
         {
             System.out.println(x);
         }
         Vector<Integer> v=new Vector<Integer>();
         v.add(1);
         v.add(2);
         v.add(3);
         System.out.println("Max value is:\t"+Collections.max(v));
         System.out.println("Min value is :\t"+Collections.min(v));
         Collections.reverse(v);
         
         System.out.println("After Reverse:\t"+v);
         Collections.rotate(v, 2);
         System.out.println("After Rotating:\t"+v);
    }
    
}
