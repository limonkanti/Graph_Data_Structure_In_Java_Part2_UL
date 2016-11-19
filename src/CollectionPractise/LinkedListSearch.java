package CollectionPractise;

import java.util.Iterator;
import java.util.*;

public class LinkedListSearch {

    public static void main(String[] args) {
        System.out.println("Elements are:");
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
       // System.out.println();
        System.out.println("Please enter a value which you want to search:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (l.contains(n)) {
            System.out.println("Element is in the list.");
        } else {
            System.out.println("Element is not found in the list.");
        }
        
    }
}
