
package StringInterviewProgram;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Test 
{
    public static void main(String[] args)
    {
        String s="I Love Java";
      /*  s.concat("Programming");
        System.out.println(s);
        
        StringBuilder sb=new StringBuilder("I Love Java");
        sb.append("Programming");
        System.out.println(sb);*/
       // String s1=s.substring(2,8);
       // System.out.println(s.charAt(3));
        StringBuffer sb=new StringBuffer("Java Is my love langu");
        
             System.out.println(s.contains("Love"));
             Date d=new Date();
             SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
             String sd=sdf.format(d);
             System.out.println(sd);
         
         
    }
    
}
