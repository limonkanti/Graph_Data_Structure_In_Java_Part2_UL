

package loopPrograms;

import java.util.Scanner;
/*
A number is called strong number if sum of the factorial of its digit is equal to number itself. For example: 145 since
1! + 4! + 5! = 1 + 24 + 120 = 145

*/

public class StrongNumber 
{
     public static void main(String args[])
    {
        System.out.println("Please Enter the renge");
        Scanner sc=new Scanner(System.in);
        int count=0;
        
        int n=sc.nextInt();
        int mod,div,item,b,sum=0,k,f=1;
        int a[]=new int[n];
        item=n;
        while(item!=0)
        {
            mod=item%10;
             count++;
            a[count]=mod;
           
            item=item/10;
            
        }
        for(int j=1;j<=count;j++)
        {
           // b=a[j];
            for(k=1;k<=a[j];k++)
            {
                f=f*k;
            }
         
           sum=sum+f; 
        }
        
        if(sum==n)
        {
             System.out.println("Yes Strong....");   
        }
        
        else
        {
            System.out.println("no Strong....");    
        }
           
        
    }
    
}
