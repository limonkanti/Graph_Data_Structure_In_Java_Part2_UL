
package interview_programs_utube_SpringHibernate_ch;


public class q_23_reverse_number
{
    void reverse(int n)
    {
        int temp,number=n;
        while(number!=0)
        {
            temp=number%10;
            System.out.print(temp+"\t");
            number=number/10;
        }
        
    }
    
     public static void main(String[] args) 
     {
         q_23_reverse_number ob=new q_23_reverse_number();
        ob.reverse(123);
         
     }
}
