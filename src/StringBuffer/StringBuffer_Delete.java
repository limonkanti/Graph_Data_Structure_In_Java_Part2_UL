
package StringBuffer;


public class StringBuffer_Delete 
{
      public static void main(String args[])
     {
         StringBuffer sb=new StringBuffer("Limon Kanti Dey");
      /*StringBuffer s=sb.delete(5,11);
         System.out.println(s);*/
        System.out.println(sb.deleteCharAt(12));
        String ss="I Love Java";
        char c[]=ss.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+"\t");
        }
         
         
     }
    
}
