
package Subeen52;


public class Problem34 
{
      public static void main(String[] args) {
        int m=2,n=50,o=3;
        for(int i=2;i<=n;i++)
        {
           if((i%m==0)&&(i%o==0))
           {
               System.out.print(i+"\t");
           }
        }
    }
    
}
