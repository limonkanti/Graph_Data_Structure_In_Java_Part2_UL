
package String;


public class String_compareTo
{
     public static void main(String args[])
     {
         String s1="Limon";
         String s2="knti";
         int i=s1.compareTo(s2);//compare with first char
         System.out.println(i);
         
         boolean b=s1.equalsIgnoreCase(s2);
         System.out.println(b);
     }
    
}
