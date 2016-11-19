
package javarevisited;

import java.util.Scanner;


public class remove_given_char 
{
    public static void main(String[] args) {
        String s="limon";
        System.out.println("Please enter a char to remove from string.");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        s=s.replace(c, ' ');
        System.out.println("After remove\t"+c+"\t the string is");
        System.out.println(s);
        
    }
    
}
