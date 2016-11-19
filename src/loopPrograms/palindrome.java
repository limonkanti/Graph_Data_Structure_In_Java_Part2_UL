
package loopPrograms;

import java.util.Scanner;

public class palindrome
{
    
      public static void main(String args[])
    {
        System.out.println("Please Enter the renge");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mod,div,sum=0,item,count=0,k=0;
        int a[]=new int[n];
        int b[]=new int[n];
        item=n;
        while(item!=0)
        {
            mod=item%10;
            a[count]=mod;
            count++;
            item=item/10;
        }
       for(int j=0;j<count;j++)
       {
           sum=sum*10+a[j];
          //System.out.println(a[j]);
       }
     if(sum==n)
     {
         System.out.println("yes palindrome....");
     }
     else
     {
          System.out.println("Not palindrome....");
     }
       
    }
}
