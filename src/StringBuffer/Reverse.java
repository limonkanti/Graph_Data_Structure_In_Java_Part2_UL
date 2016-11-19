
package StringBuffer;


public class Reverse 
{
    public static void main(String args[])
     {
         int sum =0;
         StringBuffer s=new StringBuffer("Limon Kanti Dey");
         s.reverse();
         String s3=s.toString();
         String s2[]=s3.split("\\s");
         for(int i=0;i<s2.length;i++)
         {
             System.out.print(s2[i]+"\t");
         }
       
   
        
     }
    
}
