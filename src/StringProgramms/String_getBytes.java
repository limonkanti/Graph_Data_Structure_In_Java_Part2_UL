
package StringProgramms;


public class String_getBytes
{
    public static void main(String[] args) {
        String s="12345";
        byte b[]=s.getBytes();
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
    }
    
}
