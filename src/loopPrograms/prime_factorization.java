

package loopPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class prime_factorization
{
    public static void main(String args[])
    {
        System.out.println("Please Enter the renge");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        System.out.println("The prime numbers are upto\t"+n+"\t are");
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        for(i=2;i<=n;i++)
        {
           if(n%i==0)
           {
               list.add(i);
               n=n/i;
               i--;//we have reduce the loop number
               
           }
        }
       for(int k:list)
       {
           System.out.println(k);
       }
       
    }
    
}
