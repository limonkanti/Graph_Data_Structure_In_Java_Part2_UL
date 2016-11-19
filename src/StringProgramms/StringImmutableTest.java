
package StringProgramms;


public class StringImmutableTest 
{
    public static void main(String[] args) {
        String s="i love java programming.";
        s.concat("limon");
        System.out.println(s);
        
        //not immutable
        s=s+"java";
        System.out.println(s);
        //
       // String s2=s+" i am limon";
       // System.out.println(s2);
    }
    
}
