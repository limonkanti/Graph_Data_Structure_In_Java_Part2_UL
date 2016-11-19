
package StringProgramms;


public class String2Int 
{
    public static void main(String[] args) {
        String s="12345";
        //first way
        int a=Integer.valueOf(s);
        //second way
        int b=Integer.parseInt(s);
        System.out.println(a+"\t"+b);
    }
    
}
