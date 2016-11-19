
package interview_programs_utube_SpringHibernate_ch;

public class ques_30 
{
    
     public static void main(String[] args) 
     {
         int ar[]={2,1,3,4,5,-1,10,-2};
         int max=ar[0];
         int min=ar[0],k = 0,l=0;
         for(int i=1;i<ar.length;i++)
         {
             if(max<ar[i])
             {
                 max=ar[i];
                 k=max;
             }
             if(min>ar[i])
             {
                 min=ar[i];
                 l=min;
             }
         }
         System.out.println(k);
         System.out.println(l);
     }
}
