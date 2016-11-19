package interview_programs_utube_SpringHibernate_ch;

public class print_string_dupli_char_9 {

    public static void main(String[] args) {
        String str = "laimonan";
        int count = 0;
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }
            System.out.println(str.charAt(i)+"\t"+count);
            String d=String.valueOf(str.charAt(i)).trim();
            str=str.replaceAll(d, "");
            count=0;
        }
    }
}
