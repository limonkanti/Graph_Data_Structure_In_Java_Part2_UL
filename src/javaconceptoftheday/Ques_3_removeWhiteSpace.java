package javaconceptoftheday;

public class Ques_3_removeWhiteSpace {

    public static void main(String[] args) {
        String s = "limon kanti dey";
        //type 1 using library........
        String withoutwhitespace=s.replaceAll("\\s","");
        System.out.println(withoutwhitespace);
          //type 2 without library......      
        char c[] = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < c.length; i++) {
            if ((c[i] != ' ') && (c[i] != '\t')) {
                sb.append(c[i]);
            }
        }
        System.out.println(sb);
    }

}
