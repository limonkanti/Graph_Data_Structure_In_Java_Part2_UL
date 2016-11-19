package OOPS;

import java.util.GregorianCalendar;

public class ObjectCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectCloneTest ob = new ObjectCloneTest();
        ObjectCloneTest ob1 = (ObjectCloneTest) ob.clone();
        System.out.println(ob.equals(ob1));

    }

}
