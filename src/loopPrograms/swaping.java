
package loopPrograms;

import java.util.Scanner;


public class swaping
{
    
   public static void main(String args[])
    {
        System.out.println("Please Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,item;
        System.out.println("before swaping the number is:\t"+n); 
        item=n;
        n=sum;
        sum=item;
        
         System.out.println("after swaping the number is:\t"+n+"\t"+sum); 
    }
}
