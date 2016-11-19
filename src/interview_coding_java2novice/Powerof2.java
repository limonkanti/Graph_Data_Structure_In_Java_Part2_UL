
package interview_coding_java2novice;

public class Powerof2 
{
    public static void main(String[] args) {
        int a=8;
        int l=(int) Math.pow(2, a);
        if(l==a*a)
        {
            System.out.println(a+"\t"+"is power of 2");
        }
        else
        {
            System.out.println("Not");
        }
    }
    
}
