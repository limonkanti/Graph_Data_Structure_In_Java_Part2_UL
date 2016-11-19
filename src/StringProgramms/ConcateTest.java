
package StringProgramms;



public class ConcateTest 
{
    
     public static void main(String[] args) {
        String s="i love java programming.";
        int i=500;
        String s1=s+i;
        System.out.println(s1);
       //  System.out.println(s.concat(i));//not possible
        String s2=null;
        String s3=null;
        String s4=s2+"java"+s3;
        System.out.println(s4);
       // System.out.println(s2.concat(s3));//not possible
         
      //   System.out.println(null+null);//not possible
         System.out.println("null"+"null");
      
    }
    
}
