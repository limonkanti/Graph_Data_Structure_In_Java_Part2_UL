
package OOPS;


public class MethodFacto 
{
    int f=1,i=1;
    void factTest(int a)
    {
       for(i=1;i<=a;i++)
       {
           f=f*i;
       }
       System.out.println("Factorial\t"+a+"\t is\t"+f);
        
    }
   public static void main(String args[])
    {
        
        MethodFacto ob=new MethodFacto();
        ob.factTest(5);
        
        
    }
}
