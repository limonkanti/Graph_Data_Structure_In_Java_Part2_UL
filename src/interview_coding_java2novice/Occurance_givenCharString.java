
package interview_coding_java2novice;


public class Occurance_givenCharString
{
    public static void main(String[] args) {
        String s="Today is Monday aa ";
        char c[]=s.toCharArray();
        int count=0;
        char ch='a';
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==ch)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
