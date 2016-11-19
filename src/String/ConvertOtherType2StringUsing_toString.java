
package String;

import java.io.IOException;


public class ConvertOtherType2StringUsing_toString 
{
    public static void main(String args[]) throws IOException 
    {
        StringBuffer sb=new StringBuffer("I love java");
        String s=sb.toString();
        System.out.println(s);
    }
    
}
