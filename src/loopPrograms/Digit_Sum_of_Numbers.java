

package loopPrograms;

import java.util.Scanner;

public class Digit_Sum_of_Numbers
{
      public static void main(String args[])
    {
        System.out.println("Please Enter the renge");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mod,div,sum=0;
        while(n!=0)
        {
            mod=n%10;
            sum=sum+mod;
            n=n/10;
        }
       System.out.print(sum); 
    }
    
}
