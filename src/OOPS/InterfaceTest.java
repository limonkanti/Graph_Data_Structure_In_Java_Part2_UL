
package OOPS;
interface in{
    int x=20;
    void test();
}
interface in1{
  int x=20;
    void test();
  
}
public class InterfaceTest implements in,in1
{

    public void test() {
  
        System.out.print("hi............"+in.x);
       
    }
  
   public static void main(String args[])
   {
       
       in ob=new InterfaceTest();
       ob.test();
       
   }
    
}
