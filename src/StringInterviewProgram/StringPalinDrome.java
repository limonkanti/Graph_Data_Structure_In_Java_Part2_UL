
package StringInterviewProgram;


public class StringPalinDrome
{
    
    public static void main(String args[])
    {
        String s="Madam";
        StringBuilder sb=new StringBuilder("Madam");
        String sb2=sb.reverse().toString();
        //System.out.println(sb2);
        
        //String re=sb2.toString();
        if(sb2.equalsIgnoreCase(s))
        {
            System.out.println("Yes PalinDrome\t"+sb);
        }
        else
        {
            System.out.println("Not PalinDrome\t"+sb);
        }
        
    }
}
