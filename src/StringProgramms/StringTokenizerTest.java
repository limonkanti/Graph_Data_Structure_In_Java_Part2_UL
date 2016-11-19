
package StringProgramms;

import java.util.StringTokenizer;

public class StringTokenizerTest 
{
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("I love java");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
    
}
