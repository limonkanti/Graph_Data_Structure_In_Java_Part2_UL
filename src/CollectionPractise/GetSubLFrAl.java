package CollectionPractise;

import java.util.*;

public class GetSubLFrAl {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(11);
        al.add(1111);
        al.add(11111);
        List<Integer> l = new ArrayList<Integer>(al.subList(1, 2));
        System.out.println(l);
        Vector v = new Vector(2, 4);
        v.addElement(3);
        v.addElement(3);
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.addElement(3);
        v.addElement(3);
        v.addElement(3);
        System.out.println(v.size());
        System.out.println(v.capacity());
        
    }

}
