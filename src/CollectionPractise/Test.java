package CollectionPractise;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(11);
        v.add(1);
        v.add(null);
        v.add(null);
        ArrayList<Integer> al = new ArrayList<Integer>(v);
        List<Integer> l=Collections.synchronizedList(al);
        synchronized(l)
        {
            Iterator<Integer> itr=l.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }

    }
}
