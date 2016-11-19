
package StringProgramms;


public class StringLiteralTest 
{
    public static void main(String[] args) {
        String s="limon";
        String s1="limon";
        System.out.println(s==s1);
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        
        String s2=new String("Java");
        String s3=new String("Java");
        System.out.println(s2==s3);
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
    
}
