package interview_coding_java2novice;

import java.util.*;
import java.util.*;

public class Map_Sort_OrderByValue {

    public static void main(String a[]) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("java", 20);

        map.put("C++", 45);

        map.put("Java2Novice", 2);

        map.put("Unix", 67);

        map.put("MAC", 26);

        map.put("Why this kolavari", 93);

        Set<Integer> valueSet = new TreeSet<Integer>(map.values());

        List<Integer> valueList = new ArrayList<Integer>(valueSet);

        Collections.reverse(valueList);

        System.out.println(valueList);

    }

}
