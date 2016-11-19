
package loopPrograms;

import java.util.Scanner;




public class Extrate_last_2_digits_of_year 
{
     public static void main(String args[])
    {
        System.out.println("Please Enter the renge");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int mod,div;
        int ary[]=new int[100];
        while(n!=0)
        {
            mod=n%10;
          //  System.out.print(mod);
            ary[i]=mod;
            i++;
           // System.out.println(mod);
            if(i==2)
            {
                
                break;
            }
           
            n=n/10;
            
            
        }
        for(i=2-1;i>=0;i--)
        {
            System.out.print(ary[i]+"\t");
        }
       
        
    }
    
}

    

