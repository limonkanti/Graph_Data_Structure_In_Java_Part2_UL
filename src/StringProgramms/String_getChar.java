
package StringProgramms;


public class String_getChar 
{
     public static void main(String[] args) {
        String s=new String("i love java");
        char b[]=new char[4];
         try
         {
            s.getChars(8, 11, b, 0);
             System.out.println(s);
            
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
    }
    
}
