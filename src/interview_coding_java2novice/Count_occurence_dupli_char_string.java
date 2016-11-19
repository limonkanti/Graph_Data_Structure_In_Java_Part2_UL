package interview_coding_java2novice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Count_occurence_dupli_char_string {

    public static void main(String[] args) {
        //count dupli char of a string
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        System.out.println("Enter an String:");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] chars = s1.toCharArray();
        for (Character ch : chars) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);

            } else {
                // hm.put(s1.charAt(i), hm.get(s1.charAt(i))+1);
                hm.put(ch, 1);
            }
        }
        Set<Character> keys = hm.keySet();
        for (Character ch : keys) {
            if (hm.get(ch) > 1) {
                System.out.println("Char " + ch + " " + hm.get(ch));
            }
        }
    }

}
