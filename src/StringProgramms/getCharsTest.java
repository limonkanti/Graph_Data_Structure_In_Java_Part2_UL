
package StringProgramms;


public class getCharsTest 
{
    
    public static void main(String[] args) {
        String s = "i love java programming.";
        char c[] =new char[8];
        s.getChars(7, 10, c,2);
        for(char ch:c)
        {
            System.out.print(c);
        }
        

    }

    
}
