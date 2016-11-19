
package interview_programs_utube_SpringHibernate_ch;

public class missing_number_1 
{
     public static void main(String args[]) 
     {
         int ar[]={1,2,3,5,6};
         int length=ar.length+1;
         int i,sum=0,k;
         for(i=0;i<ar.length;i++)
         {
             sum=sum+ar[i];
         }
         k=sum;
         int expected=((length)*(length+1))/2;
         int miss=expected-k;
         System.out.println("The missing number is:\t"+miss);
     }
    
}
