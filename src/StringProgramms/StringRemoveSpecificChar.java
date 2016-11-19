
package StringProgramms;


public class StringRemoveSpecificChar 
{
    
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Hello Java , I love Java");
      //  System.out.println(s.deleteCharAt(2));
        s.deleteCharAt(2);
        String ss=s.toString();
        System.out.println(ss);
       
    }
    
}
