
package String;


public class String_charAt 
{
     public static void main(String args[])
     {
         String s="Limon Kanti Dey";
         char c=s.charAt(1);
         System.out.println(c);
         
         // using loop
         int l=s.length();
         for(int i=0;i<l;i++)
         {
             c=s.charAt(i);
             System.out.println("The position "+"\t"+i+"\t"+"has "+"\t "+c);
         }
         
         
     }
    
}
