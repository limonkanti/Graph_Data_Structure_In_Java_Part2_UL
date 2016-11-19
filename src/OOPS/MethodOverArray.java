
package OOPS;

public class MethodOverArray 
{
    void arrayTest(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
        
    }
     void arrayTest(char ar1[])
    {
        for(int i=0;i<ar1.length;i++)
        {
            System.out.println(ar1[i]);
        }
        
    }
    
    public static void main(String args[])
    {
        int ar[]={1,2,3,4};
        MethodOverArray ob=new MethodOverArray();
        ob.arrayTest(ar);
        char ar1[]={'a','b','c'};
        ob.arrayTest(ar1);
        
    }
}
