
package If_Else_Beg;


public class Bitwise
{
    
     public static void main(String args[])
     {
         
     int a = 60;	/* 60 = 0011 1100 */  
     int b = 13;	/* 13 = 0000 1101 */
     int c = 0;

     c = a & b;//AND       /* 12 = 0000 1100 */ 
     System.out.println("a & b = " + c );

     c = a | b; //OR      /* 61 = 0011 1101 */
     System.out.println("a | b = " + c );

     c = a ^ b;  //XOR     /* 49 = 0011 0001 */
     System.out.println("a ^ b = " + c );

     c = ~a;  //NOT        /*-61 = 1100 0011 */
     System.out.println("~a = " + c );

     c = a << 2;//LEFT SHIFT     /* 240 = 1111 0000 */
     //60*2=120;120*2
     System.out.println("a << 2 = " + c );
     
      c = a << 3;     /* 240 = 1111 0000 */
     System.out.println("a << 3 = " + c );
     
     c = a >> 2;//RIGHT SHIFT    /* 15 = 1111 */
     System.out.println("a >> 2  = " + c );

     c = a >>> 2; //NOT=RIGHT SHIFT    /* 15 = 0000 1111 */
     System.out.println("a >>> 2 = " + c );
  }
    
}
