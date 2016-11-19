
package interview_coding_java2novice;

import java.util.*;


public class deci_to_bi
{
    
    public static void main(String[] args) {
        System.out.println("Please Enter A Decimal Number.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[25];
        int i=0;
        int count=0;
        while(n!=0)
        {
            
          ar[i++]=n%2;
          count++;
          n=n/2;    
        }
        for(int j=count-1;j>=0;j--)
        {
            System.out.print(ar[j]+"\t");
        }
        
    }
}
