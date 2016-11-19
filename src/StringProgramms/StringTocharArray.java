
package StringProgramms;


public class StringTocharArray

{
     
    public static void main(String[] args) {
        String s = "i love java programming.";
        char ch[]=s.toCharArray();
        for(char c:ch)
        {
            System.out.print(c+"\t");
        }

    }
    
}
