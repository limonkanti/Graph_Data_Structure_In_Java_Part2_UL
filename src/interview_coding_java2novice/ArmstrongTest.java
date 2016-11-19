
package interview_coding_java2novice;

import java.util.Scanner;


public class ArmstrongTest 
{
    public static void main(String[] args)
    {
        System.out.println("Please Enter A Decimal Number.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int sum=0;
        while(t!=0)
        {
            int temp=t%10;
            sum=sum+temp*temp*temp;
            t=t/10;
            
        }
        if(n==sum)
        {
            System.out.println("Armstrong!!!");
        }
        else
        {
             System.out.println("Not Armstrong!!!");
        }
        
    }
   
    
}
