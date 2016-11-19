

package loopPrograms;

import java.util.Scanner;

public class LCM 
{
    
     public static void main(String args[])
    {
        System.out.println("Please Enter the number of m");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println("Please Enter the number of n");
        int n=sc.nextInt();
        int r,x,y;
        x=m;
        y=n;
        System.out.println("The LCM number of\t"+m+"\tAnd\t"+n+"\tis");
        while(m!=n)
        {
            if(m>n)
            {
                m=m-n;
            }
            else
            {
                n=n-m;
            }
        }
       System.out.println(x*y/m);
               
        
        
        
    }
}
