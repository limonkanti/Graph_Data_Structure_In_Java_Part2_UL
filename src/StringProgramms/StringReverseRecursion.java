
package StringProgramms;


public class StringReverseRecursion 
{
    static String recursiveReverse(String s)
    {
        if((null==s)||(s.length()<=1))
        {
            return s;
        }
        else
        {
            return recursiveReverse(s.substring(1))+s.charAt(0);
        }
        
    }
    
    public static void main(String[] args) 
    {
        String s="java";
        System.out.println(recursiveReverse(s));
        
        
    }
    
    
}
