package StringBuffer;

public class Insert_1 {

    public static void main(String args[])
    {
        
        StringBuffer sb, sb2;
        sb = new StringBuffer("Limon Kanti");
        sb2 = new StringBuffer(" Dey");
       // sb = sb.insert(3, sb2);
        System.out.println(sb.insert(2, sb2));

    }

}
