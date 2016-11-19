
package StringBuffer;

public class StringBuilder_Reverse
{
    public static void main(String args[])
     {
         StringBuffer sb=new StringBuffer("I am Limon");
         sb.reverse();
        
         String s[]=new String[2];
         for(int i=0;i<2;i++)
         {
             s[i]=sb.reverse().toString();
             System.out.println(s[i]);
         }
        // System.out.println(sb.reverse());
         
         
     }
    
}
