
package CollectionPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class asListTest 
{
    public static void main(String[] args) {
        Integer ar[]={1,2,3,4,5,6};
        List<Integer> l=Arrays.asList(ar);
        
        System.out.println(l);
         List<Integer> l2=new ArrayList(l);
         System.out.println(l2);
        
    }
}
