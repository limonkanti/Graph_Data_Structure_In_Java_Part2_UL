
package StringProgramms;


public class StringInternTest
{
    
    public static void main(String[] args) 
    {
        //string intern is used for copy of one string object to  string constatnt pool//
        String s="java";
        String s1=s.intern();
        System.out.println(s.equals(s1));
        System.out.println(s==s1);
        String s2=new String("java");
        String s3=s2.intern();
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));

    }
    
}
