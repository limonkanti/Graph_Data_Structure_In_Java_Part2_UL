
package StringProgramms;


public class StringCopy 
{
     public static void main(String[] args) {
        String s="ABCDEF";
        char ch[]=s.toCharArray();
        String s2=new String(ch);
         System.out.println(s2);
    }
    
}
