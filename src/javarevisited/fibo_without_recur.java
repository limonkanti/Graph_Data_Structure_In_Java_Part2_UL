
package javarevisited;

public class fibo_without_recur 
{
    public static void main(String[] args)
    {
        int n=10;
        int temp,f1=1,f2=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            temp=f1+f2;
            System.out.println(temp);
            f1=f2;
            f2=temp;
        }
        
    }
    
}
