
package list_LinkedList;

import java.util.Collections;
import java.util.Vector;


public class VectorBinarySearch 
{
    void binarySearch()
    {
        Vector<Integer> v=new Vector<Integer>();
        v.add(3);
        v.add(5);
        v.add(1);
        v.add(2);
        Collections.sort(v);
        System.out.println("The list is:\t"+v);
        int pos=Collections.binarySearch(v, 2);
        System.out.println("Position of 2  is:\t"+pos);
    }
    
    public static void main(String args[])
     {
         VectorBinarySearch ob=new VectorBinarySearch();
         ob.binarySearch();
     }
}
