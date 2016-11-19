package Map;

import java.util.Hashtable;

public class HashTableTest {

    public static void main(String[] args) {

        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
        hm.put(100, "Amit");
        hm.put(107, "Amit");
        hm.put(102, "Ravi");
        hm.put(108, "Ravi");
        hm.put(101, "Vijay");
        hm.put(103, "Rahul");
        System.out.println(hm);
    }

}
