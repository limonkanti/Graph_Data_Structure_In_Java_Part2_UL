
package InnerClasas;

interface A
{
   class M
   {
       void s()
       {
           System.out.println("hhh");
       }
   }
}
public class NestedInter extends A.M
{

    
    public void sms() 
    {
        System.out.println("Hei.....");
    }
    public static void main(String[] args) {
       A.M ob=new NestedInter();
       ob.s();
    }
    
}
