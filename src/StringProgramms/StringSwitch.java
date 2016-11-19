package StringProgramms;

public class StringSwitch {

    public static void main(String[] args) {
        String str = "limon";
        switch (str) {
            case "limon":
                System.out.println("Yes");
                break;
            case "raju":
                System.out.println("No");
                break;
            default:
                System.out.println("11111");

        }

        String s1 = "abc";
        String s2 = new String("abc");
        s2.intern();
        System.out.println(s1 == s2);
    }

}
