
package StringProgramms;


public class StringRotateTest
{
    public static void main(String[] args)
    {
        String s="javacc++javaphp";
        String s1="javaphpjava";
        String s3=s+s;
        if(s3.contains(s1))
        {
            System.out.println("Yes!!! the string is rotate");
        }
        else
        {
            System.out.println("No!!! the string is rotate");
        }
        
    }
    
}
