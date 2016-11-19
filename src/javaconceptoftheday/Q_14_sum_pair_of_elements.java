
package javaconceptoftheday;

import java.util.Scanner;


public class Q_14_sum_pair_of_elements
{
    public static void main(String[] args)
    {
        int ar[]={4, 6, 5, -10, 8, 5, 20};
        System.out.println("Please enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <ar.length; i++) 
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]+ar[j]==n)
                {
                    System.out.println(ar[i]+"+"+ar[j]+"\t=\t"+n);
                }
            }
            
        }
        
        
    }
    
}
