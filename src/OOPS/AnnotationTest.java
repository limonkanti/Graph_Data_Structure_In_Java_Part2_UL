package OOPS;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class AnnotationTest {
    void n()
    {
        System.out.println("N");
    }
    @Deprecated
    void m()
    {
        System.out.println("M");
    }

    public static void main(String args[])
    {
        ArrayList list = new ArrayList();
        list.add("sonoo");
        list.add("vimal");
        list.add("ratan");
        for(Object obj:list)
        {
            System.out.println(obj);
        }
AnnotationTest ob=new AnnotationTest();
ob.m();
    }
}
