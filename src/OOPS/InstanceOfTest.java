
package OOPS;

class A{
    
}

public class InstanceOfTest extends A
{
    public static void test(A a)
    {
        InstanceOfTest ob=(InstanceOfTest)a;
        System.out.println("Ok Downcasting");
    }
     public static void main(String args[])
     {
        
          //System.out.println(ob instanceof InstanceOfTest);
         A ob=new InstanceOfTest();
         test(ob);
         
     }
}
