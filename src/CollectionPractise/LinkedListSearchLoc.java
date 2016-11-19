
package CollectionPractise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class LinkedListSearchLoc {
     public static void main(String[] args) {
        System.out.println("Elements 5are:");       
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(3);
        l.add(2);
      //  l.add(1,22);
        l.add(1);
        Iterator itr = l.iterator();
       // Iterator itr1 = l.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
       // System.out.println();
        System.out.println("Please enter a value which you want to search:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index=l.indexOf(n);
        if(index>=0)
        {
            System.out.println("The loc of\t"+n+"\t"+"is\t"+index);
        }
        else
        {
            System.out.println(n+"\t is not found in the list.\t");
        }
      //  System.out.println(index);
      
        
    }
    
}
