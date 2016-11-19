
package javaconceptoftheday;

import java.util.*;


public class Q_19_Intersection 
{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<Integer> al2=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al2.add(1);
        al2.add(4);
        al2.add(5);
        al.retainAll(al2);
        System.out.println(al);
    }
    
}
