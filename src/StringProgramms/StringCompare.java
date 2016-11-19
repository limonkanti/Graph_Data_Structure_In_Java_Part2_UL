
package StringProgramms;


public class StringCompare 
{
    public static void main(String[] args) {
        String s="java";
        String s1="Java";
        System.out.println(s.compareTo(s1));
        System.out.println(s1.compareTo(s));
        System.out.println(s.compareToIgnoreCase(s1));
    }
    
}
