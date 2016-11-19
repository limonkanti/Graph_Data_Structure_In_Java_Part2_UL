
package String;


public class immutable_and_mutable_test 
{
    
     public static void main(String args[])
     {
         //mutable test
         StringBuffer sb=new StringBuffer("Limon");
         sb.append("Kanti Dey");
         System.out.println(sb);//output=Limon Kanti Dey
         
         //immutable test
         String s=new String("Limon");
         s.concat("Kanti Dey");
         System.out.println(s);//output =Limon
         //
         
         
     }
}
