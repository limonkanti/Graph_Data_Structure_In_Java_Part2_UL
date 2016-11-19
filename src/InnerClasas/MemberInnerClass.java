
package InnerClasas;


public class MemberInnerClass 
{
    private int data =50;
    
    class A
    {
        int c,d=50;
        void sum()
        {
            System.out.println("sum is.\t"+data+d);
        }
    }
    void display()
    {
        A ob=new A();
        ob.sum();
    }
    public static void main(String[] args) 
    {
        MemberInnerClass ob=new MemberInnerClass();
        ob.display();
        MemberInnerClass.A ob1=ob.new A();
        ob1.sum();
        
        
        
    }
    
}
