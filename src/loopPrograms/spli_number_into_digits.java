
package loopPrograms;

import java.util.Scanner;

public class spli_number_into_digits 
{
    
public static void main(String args[])
    {
        System.out.println("Please Enter the renge");
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int mod,div=0,i=0;
        int a[]=new int[10];
        while(n!=0)
        {
            mod=n%10;
            i++;
            a[i]=mod;
            n=n/10;
            
        }
        
        for(int j=i;j>=1;j--)
        {
            System.out.print(a[j]+"\t");
        }
        
        
    }
}
