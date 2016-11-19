
package String;

public class count_total_char_with_or_without_spaces 
{
     public static void main(String args[])
     {
         int sum =0;
         String s;
         String s1="limon kanti dey";
         String s2[]=s1.split("\\s");
         for(int i=0;i<s2.length;i++)
         {
           sum=sum+s2[i].length();
         }
         System.out.print(sum);
   
        
     }
    
}
