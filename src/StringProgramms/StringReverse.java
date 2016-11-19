
package StringProgramms;

public class StringReverse
{
    public static void main(String[] args) 
    {
        String s="i love java";
        char ch[]=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
        System.out.println();

    }
    
    
}
