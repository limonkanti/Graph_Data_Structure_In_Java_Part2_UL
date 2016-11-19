package List_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Sublist {

    public static void main(String args[]) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        System.out.println("Initialize using For-Each-Loop");
        List<Integer> l2 = li.subList(1, li.size());
         for(int x:l2)
         {
             System.out.println(x);
         }
    }

}
