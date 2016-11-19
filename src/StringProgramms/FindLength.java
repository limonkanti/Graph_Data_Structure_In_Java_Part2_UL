
package StringProgramms;

public class FindLength 
{
     public static void main(String[] args) {
        String s="i love java programming.";
        
        System.out.println(s.length());
        //
       // String s2=s+" i am limon";
       // System.out.println(s2);
        char ch[]={'l','i','m','o','n'};
        String ss=new String(ch);
        System.out.println(ss.length());
        String s2=new String(ss+"java");
        System.out.println(s2.length());
    }
    
    
}
