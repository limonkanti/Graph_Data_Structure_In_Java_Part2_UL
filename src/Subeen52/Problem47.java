package Subeen52;

import java.util.*;

public class Problem47 {

    public static void main(String[] args) 
    {
        Set<Integer> s1=new TreeSet<Integer>();
        s1.add(2);
        s1.add(2);
        s1.add(3);
        s1.add(5);
        Set<Integer> s2=new TreeSet<Integer>();
        s2.add(4);
        s2.add(4);
        s2.add(1);
        s2.addAll(s1);
        System.out.print(s2+"\t");
    }
}
