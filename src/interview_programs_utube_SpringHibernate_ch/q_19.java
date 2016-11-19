
package interview_programs_utube_SpringHibernate_ch;

public class q_19 
{
    public static void main(String[] args) 
    {
        int ar[]={3,4,1,7,8};
        int max=ar[0],k;
        int secondMax=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(max<ar[i])
            {
                max=ar[i];
            }
            
        }
        k=max;
        System.out.println("The first max value is:\t"+k);
        for(int j=1;j<ar.length;j++)
        {
            if((secondMax<ar[j])&&(max>ar[j]))
            {
                secondMax=ar[j];
            }
        }
        System.out.println("The Second max value is:\t"+secondMax);
        
        
    }
    
}
