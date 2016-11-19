
package List_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RemoveFromSpecificIndex 
{
    public static void main(String args[])
    {
        List<Integer> li=new ArrayList<Integer>();
        li.add(3);
        li.add(1);
        li.add(2);
         List<Integer> l2=new ArrayList<Integer>();
        System.out.println("Before Removing The Elements are:");
        for(int x:li)
        {
            System.out.println(x);
        }
       System.out.println("Please enter an index which you want to delete:");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
       li.remove(n);
       System.out.println("After Removing The Elements are:");
       
            System.out.println(li.get(0));
        
    }
    
}
