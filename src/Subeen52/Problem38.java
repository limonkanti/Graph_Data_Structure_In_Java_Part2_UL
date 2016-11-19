
package Subeen52;


public class Problem38
{
    public static void main(String[] args) {
        int m=1,n=3,i=0,j=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                 System.out.print("1");
            }
            System.out.println(); 
        }
        int k=n-m;
         for(i=k;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                 System.out.print("1");
            }
            System.out.println(); 
        }
        
    }
    
}
