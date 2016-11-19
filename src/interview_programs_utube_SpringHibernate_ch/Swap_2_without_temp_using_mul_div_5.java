
package interview_programs_utube_SpringHibernate_ch;

public class Swap_2_without_temp_using_mul_div_5 
{
    public static void main(String args[])
    {
        int a=20;
        int b=10;
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a+"\t"+b);
    }
    
}
