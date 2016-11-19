package Algorithm;

public class Problem52 {

    public static void main(String[] args) {
        String str = "ddddd";
        String substr = "dd";
        int count = 0;
        int i = str.indexOf(substr);
        System.out.println(i);
        while ((i < str.length()) && i != -1) {
            i = str.indexOf(substr, i + 1);
            count++;
        }
        System.out.println(count);
    }

}
