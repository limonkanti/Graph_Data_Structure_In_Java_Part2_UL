
package OOPS;

public class TestInstance
{
    int data;
    TestInstance()
    {
        System.out.println("Constructor"+data);
    }
    {
        data=50;
         System.out.println("Initialize\t"+data);
    }
     public static void main(String args[])
     {
         TestInstance ob=new TestInstance();
         TestInstance ob1=new TestInstance();
         
     }
}
