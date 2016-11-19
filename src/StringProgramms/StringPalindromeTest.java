
package StringProgramms;


public class StringPalindromeTest 
{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("22552");
        String s=sb.toString();
        String s2=sb.reverse().toString();
        if(s.equals(s2))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
      
    }
    
}
