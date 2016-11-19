package interview_coding_java2novice;

import java.util.*;

public class Count_occurence_each_char_string {

    public static void main(String[] args) {
        //count char of a string
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        System.out.println("Enter an String:");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            if(!hm.containsKey(s1.charAt(i)))
            {
                hm.put(s1.charAt(i),1);
               
            }
            else
            {
               // hm.put(s1.charAt(i), hm.get(s1.charAt(i))+1);
                hm.put(s1.charAt(i), hm.get(s1.charAt(i))+1);
            }
        }
        System.out.println(hm);
        System.out.println("First non repeated char is.");
        for(int i=0;i<s1.length();i++)
        {
            if(hm.get(s1.charAt(i))==1)
            {
                System.out.println(s1.charAt(i));
                break;
            }
        }
        System.out.println("First repeated char is.");
        for(int i=0;i<s1.length();i++)
        {
            if(hm.get(s1.charAt(i))>1)
            {
                System.out.println(s1.charAt(i));
                break;
            }
        }
    }

}
