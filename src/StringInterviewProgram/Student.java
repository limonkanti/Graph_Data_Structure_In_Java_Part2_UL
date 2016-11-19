package StringInterviewProgram;

import java.util.StringTokenizer;

class Student {
    
    public static void test(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        
    }

    public static void main(String args[])
    {

        int a[]={1,2,3};
        
        test(a);
        Class c=a.getClass();
        String name=c.getName();
        System.out.println(name);

    }
}
