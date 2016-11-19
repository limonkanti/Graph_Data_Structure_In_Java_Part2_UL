
package StringProgramms;


public class String2ASCII_convert 
{
    public static void main(String[] args) {
        String s="ABCDEF";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            System.out.println((int)ch[i]);
        }
    }
    
}
