
package String;


public class FIndLastPosiOfString 
{
      public static void main(String args[]) 
      {
      
          String s="Hello world,Hello world";
          
          
         int lastIndexOf = s.lastIndexOf("hello");
         if(lastIndexOf<0)
         {
             System.out.println("Not Found");
         }
         else
         {
             System.out.println("Found");
         }
         
          StringBuilder sb;
          sb=new StringBuilder("Hello");
          StringBuilder sb1;
          sb1=new StringBuilder("Java");
          
         // String ss=sb.toString();
         // System.out.println(ss);
          String s2="I love java programming";
          String ar[]=s2.split("\\s");
          int length=ar.length;
          for(int i=0;i<length;i++)
          {
              System.out.println(ar[i]);
          }
          
         String ss="I Love Java";
         System.out.format("%s\n", ss);
      }
    
}
