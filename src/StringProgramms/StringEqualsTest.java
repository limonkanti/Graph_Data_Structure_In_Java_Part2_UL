
package StringProgramms;


public class StringEqualsTest 
{
    public static void main(String[] args) {
        String s="java";
        String s1="java";
        String s2=new String("programming");
        String s3=new String("programming");
        String s4=new String("java");
        System.out.println(s.equals(s1));
        System.out.println(s2.equals(s3));
        System.out.println(s.equals(s4));
        System.out.println(s.hashCode()==s4.hashCode());

    }
    
}
