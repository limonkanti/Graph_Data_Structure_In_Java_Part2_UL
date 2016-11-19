
package InnerClasas;


public class StaticNestedTest 
{
    static int data=60;
    int b=5;
    static class test
    {
        void display()
        {
            
            System.out.println(data);
        }
        static void dis()
        {
            System.out.println(data);
        }
    }
    public static void main(String[] args) {
        ////////////////////////////////////////
        StaticNestedTest.test ob=new StaticNestedTest.test();//call non static method
        ob.display();
        ////////////////////////////////////////
        StaticNestedTest.test.dis();//call static method
        
                
    }
}
