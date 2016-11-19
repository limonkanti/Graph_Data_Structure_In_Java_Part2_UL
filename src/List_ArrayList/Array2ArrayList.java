
package List_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Array2ArrayList 
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
       
    }

    
}
