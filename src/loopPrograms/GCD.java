
package loopPrograms;

import java.util.Scanner;

public class GCD 
{
     public static void main(String args[])
    {
        System.out.println("Please Enter the number of m");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int k=m;
        System.out.println("Please Enter the number of n");
        int n=sc.nextInt();
        int l=n;
        int r;
        int mul=k*l;
        System.out.println("The GCD number of\t"+m+"\tAnd\t"+n+"\tis");
        while(m!=0)
        {
            r=n%m;
            n=m;
            m=r;
            
        }
       System.out.println(m);
               
   //    int k=10,y=25;
    //   int l=k%y;
   //    System.out.println(l);
        
        
    }
    
    
}
