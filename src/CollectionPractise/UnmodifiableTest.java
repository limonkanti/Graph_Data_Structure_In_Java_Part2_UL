
package CollectionPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UnmodifiableTest 
{
    public static void main(String[] args) {
        List<Integer> li=new ArrayList();
        li.add(1);
        li.add(11);
        li.add(111);
        
        System.out.println(li);
        List<Integer> l2=Collections.unmodifiableList(li);
        l2.add(4);
        System.out.println(l2);
    }
    
}
