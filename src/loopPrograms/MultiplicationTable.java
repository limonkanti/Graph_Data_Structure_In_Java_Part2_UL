
package loopPrograms;

public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        int max = 5,k;
        int i=1,f=1,n=5,sum=0;
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=10;j++)   
            {
                k=i*j;
                System.out.print(i*j+" ");
            }
             System.out.println();
        }
     
     }
    
}
