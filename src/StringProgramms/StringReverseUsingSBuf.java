
package StringProgramms;


public class StringReverseUsingSBuf 
{
     
    public static void main(String[] args) 
    {
        //string intern is used for copy of one string object to  string constatnt pool//
      StringBuffer sb=new StringBuffer("java");
      sb.reverse();
      System.out.println(sb);
      

    }
    
}
