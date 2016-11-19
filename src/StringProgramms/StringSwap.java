
package StringProgramms;


public class StringSwap 
{
    public static void main(String[] args) {
        String a="123";
        String b="456";
        System.out.println("Before Swapping\t"+a+"\t"+b);
        a=a+b;
        b=a.substring(0,(a.length()-b.length()));
        a=a.substring(b.length());
        System.out.println("After Swapping\t"+a+"\t"+b);
    }
    
}
