package javaconceptoftheday;

public class Q_22_Reverse_Each_Word {

    public static void main(String[] args) {

        String str = "limon kanti dey";
        String words[]=str.split(" ");
        String reversestring="";
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            String reverseword="";
            for(int j=word.length()-1;j>=0;j--)
            {
                reverseword=reverseword+word.charAt(j);
            }
            reversestring=reversestring+reverseword+" ";
            
        }
        System.out.print(reversestring);
        
        
    }

}
