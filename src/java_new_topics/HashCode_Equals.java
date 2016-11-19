
package java_new_topics;

import java.util.ArrayList;


public class HashCode_Equals
{
    
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
         ArrayList<Integer> al2=new ArrayList<Integer>();
        al2.add(1);
        al2.add(2);
        System.out.println(al.equals(al2));
    }
}
