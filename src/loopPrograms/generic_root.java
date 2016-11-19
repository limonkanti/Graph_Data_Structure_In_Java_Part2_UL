

package loopPrograms;
/*It sum of digits of a number unit we don't get a single digit. For example:
Generic root of 456: 4 + 5 + 6 = 15 since 15 is two digit numbers so 1 + 5 = 6
So, generic root of 456 = 6*/

import java.util.Scanner;

public class generic_root 
{
    
     public static void main(String args[])
    {
        System.out.println("Please Enter the renge");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int mod,div,sum=0,sum2=0, k=0;
        while(n!=0)
        {
            mod=n%10;
            sum=sum+mod;
            n=n/10;
            
        }
        k=sum;
        System.out.println("sum of the number is"+k);
       while(k!=0)
        {
            mod=k%10;
            sum2=sum2+mod;
            k=k/10;
            
        }
       System.out.println("Generic root of is"+sum2);
        
    }
}
