package Subeen52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem36 {

    public static void main(String[] args) {
        String str[]={"kanti","dey","limon"};
        System.out.println("Befort Sort : ");
        for(int i=0;i<str.length;i++)
        {
            System.out.print(str[i]+"\t");
        }
        System.out.println();
        System.out.println("After Sort : ");
        ArrayList<String> al=new ArrayList<String>();
        for(int i=0;i<str.length;i++)
        {
            String k=str[i];
            al.add(k);
            //System.out.print(str[i]+"\t");
        }
     
        Collections.sort(al);
        System.out.println(al);
        

    }

}
