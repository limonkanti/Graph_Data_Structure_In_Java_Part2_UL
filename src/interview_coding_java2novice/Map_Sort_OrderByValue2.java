
package interview_coding_java2novice;

import java.util.*;
import java.util.Map.*;


public class Map_Sort_OrderByValue2
{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Why this kolavari", 93);
        Set<Entry<String,Integer>> set=map.entrySet();
        List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>(set);
        Collections.sort(list,new Comparator<Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) 
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        }
        );
        for(Map.Entry<String, Integer> entry:list)
        {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
        
        

    }
    
}
