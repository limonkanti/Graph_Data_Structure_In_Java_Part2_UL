
package interview_programs_utube_SpringHibernate_ch;


public class String_reverse_27_part2 
{
     
    public static void main(String[] args) {
        String str="limon kanti";
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        sb=sb.reverse();
        for(int i=0;i<sb.length();i++)
        {
            System.out.print(sb.charAt(i));
        }
        
    }
    
}
