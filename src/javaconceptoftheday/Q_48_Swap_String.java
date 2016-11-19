package javaconceptoftheday;

public class Q_48_Swap_String {

    public static void main(String[] args) {
        //type 1.....
        String s1 = "java";
        String s2 = "oop";
        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println(s1 + "\t" + s2);

        //swap string without 3rd variable type 2.....
        String a = "one";
        String b = "two";
        a = a + b;
        b=a.substring(0,(a.length()-b.length()));
        a=a.substring(b.length());
        System.out.println(a + "\t" + b);
        

    }

}
