
package interview_programs_utube_SpringHibernate_ch;

public class q_34 
{
    public static void main(String[] args) {
        int n=7;
        int m=n/2;
        int flag=0;
        for(int i=2;i<=m;i++)
        {
            if(n%i==0)
            {
                System.out.println("Number is not prime");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Prime!!!");
            
        }
        
        
    }
    
}
