
package StringProgramms;


public class String2Bytes 
{
    public static void main(String[] args) {
        String s="11";
        byte b=Byte.parseByte(s);
        System.out.println(b);
        
        byte bb=12;
        String ss=String.valueOf(bb);
        System.out.println(ss);
    }
    
}
