package CollectionPractise;

import java.util.ArrayList;

public class AL2Array {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(11);
        int ar[] = new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            ar[i] = al.get(i);

        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

}
