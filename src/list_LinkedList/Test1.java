
package list_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;


public class Test1 
{
    public static void main(String args[])
    {
        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println("Please enter an element");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=l.indexOf(n);
        System.out.println(l.contains(n));
        System.out.println("position is");
        System.out.println(pos);
       
        
    }
    
}
