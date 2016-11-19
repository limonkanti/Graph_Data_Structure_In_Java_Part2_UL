package CollectionPractise;

import java.util.ArrayList;
import java.util.*;

public class ReDupFrAL {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(11);
        v.add(1);
        v.add(1);
        ArrayList<Integer> al = new ArrayList<Integer>(v);
        System.out.println("Before Convert");
        System.out.println(al);
        HashSet<Integer> hs = new HashSet<Integer>(al);
        ArrayList<Integer> al2 = new ArrayList<Integer>(hs);
        System.out.println("After Convert");
        System.out.println(al2);

    }

}
