
package StringInterviewProgram;

public class TotalNumOfOccurenceChar
{
    public static void main(String[] args)
    {
        String s="I love java programming";
        char c='a';
        int count=s.length()-s.replace("m","").length();
        System.out.println(count);
        
         
        
    }
    
}
