 
package StringBuffer;


public class SetCharAT
{
    public static void main(String args[])
     {
         StringBuffer sb=new StringBuffer("Limon Kanti Dey");
         String ss=sb.toString();
         sb.setCharAt(5, 'a');
        
        // System.out.println(sb);//
         
         String s=sb.toString();
         System.out.println(s);
         
         
     }
    
}
