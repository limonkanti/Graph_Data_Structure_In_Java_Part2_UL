
package interview_programs_utube_SpringHibernate_ch;


public class find_dupli_from_array_25
{
    
      public static void main(String[] args)
     {
         int ar[]={1,22,3,22};
         int count=0;
         for(int i=0;i<ar.length;i++)
         {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    count++;
                  //  break;
                }
            }
           
         }
         if(count>=2)
            {
                 System.out.println("The array contains duplicate.");
            }
            else
            {
                System.out.println("The array does not contains duplicate.");
            }
     }
}
