
package interview_coding_java2novice;


public class reverse_string_recur_6 
{
    public String reverse(String str)
    {
        if((str==null)||(str.length()<=1))
            return str;
        else
            return reverse(str.substring(1))+str.charAt(0);
        
    }
    
    public static void main(String[] args)
    {
        reverse_string_recur_6 ob=new reverse_string_recur_6();
        String str="limon";
        System.out.println(ob.reverse(str));
       
        
    }
    
}
