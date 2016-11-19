
package loopPrograms;

import java.util.Scanner;
/*EXAMPLE 1: 153
TOTAL DIGITS IN 153 IS 3
AND 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
Example 2: 1634
Total digits in 1634 is 4
And 1^4 + 6^4 + 3^4 +4^4 = 1 + 1296 + 81 + 64 =1634
Examples of Armstrong numbers: 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725*/
public class Armostrong_number 
{
    public static void main(String args[])
    {
        System.out.println("Please Enter the renge");
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int mod,div=0,i,sum=0,k,l;
        int a[]=new int[10];
        int temp;
        temp=n;
        while(temp!=0)
        {
            mod=temp%10;
           count++;
           a[count]=mod;
            temp=temp/10;
            
        }
        k=count;
        for( i=1;i<=k;i++)
        {
           
           
                 sum=(int) (sum+Math.pow(a[i], k));
           
        }
      
      if(sum==n)
      {
           System.out.println(" Armostrong...");
      }
      else
      {
          System.out.println("Not Armostrong...");
      }
      
      
    }
    
}
