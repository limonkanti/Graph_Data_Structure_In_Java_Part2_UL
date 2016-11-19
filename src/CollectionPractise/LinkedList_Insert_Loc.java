
package CollectionPractise;

import java.util.*;


public class LinkedList_Insert_Loc
{
    public static void main(String[] args) {
        System.out.println("Before insert elements are:");       
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(3);
        l.add(null);
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
       // System.out.println();
       // System.out.println("Please enter a location where you want to insert:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a location where you want to insert:");
        int n = sc.nextInt();
        System.out.println("Please enter an item which you want to insert:");
        int item=sc.nextInt();
        l.add(n, item);
        System.out.println("After insert elements are:");       
        Iterator itr1 = l.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());

        }
    
        
    }
    
}
