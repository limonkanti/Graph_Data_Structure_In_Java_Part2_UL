
package interview_programs_utube_SpringHibernate_ch;


public class ques_32 
{
    public int fibo(int n)
    {
        int number=n;
        if((n==1)||(n==0))
            return number=1;
        else
        {
            int result=fibo(n-1)+fibo(n-2);
            return result;
        }
        
        
    }
     public static void main(String[] args) 
     {
         ques_32 ob=new ques_32();
         int n=10;
         for(int i=0;i<n;i++)
         {
             System.out.println(ob.fibo(i));
         }
         
     }
}
