package interview_programs_utube_SpringHibernate_ch;

public class Ques27 {

    public static void main(String[] args) {
        String str = "limon";
        System.out.println("Before Reverse:\t" + str);
        String str2 = "";
        char ch[] = str.toCharArray();
        for (int c = ch.length - 1; c >= 0; c--) {
            str2 = str2 + ch[c];

        }
        System.out.println(" After Reverse:\t" + str2);

    }

}
