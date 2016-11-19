package interview_programs_utube_SpringHibernate_ch;

public class Swap_with_temp_variable_10 {

    public static void main(String args[]) {
        int a = 20;
        int b = 10;
        System.out.println("Before swap.\t"+a + "\t" + b);
        int temp;
        temp=a;
        a=b;
        b=temp;
      

        System.out.println("After swap.\t"+a + "\t" + b);
    }

}
