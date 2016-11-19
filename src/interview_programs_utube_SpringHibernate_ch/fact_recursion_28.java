
package interview_programs_utube_SpringHibernate_ch;


public class fact_recursion_28 
{
  int recurTest(int n)
   {
       int number=n;
       if((number==1))
           return number=1;
       else
       {
           int result=number*recurTest(n-1);
           return result;
       }
       
   }
    
     public static void main(String[] args) 
     {
         int n=5;
         fact_recursion_28 ob=new fact_recursion_28();
         System.out.println(ob.recurTest(5));
        for(int i=1;i<=n;i++)
        {
            System.out.println(ob.recurTest(i));
        }
     }
}
