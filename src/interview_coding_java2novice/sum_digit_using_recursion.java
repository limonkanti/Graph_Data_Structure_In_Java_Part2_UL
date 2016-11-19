
package interview_coding_java2novice;

public class sum_digit_using_recursion 
{
    int sum=0;
    public int getNumberSum(int number)
    {
        if(number==0)
        {
            return sum;
        }
        else
        {
            sum+=(number%10);
            getNumberSum(number/10);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        sum_digit_using_recursion ob=new sum_digit_using_recursion();
        System.out.println("Sum is:\t"+ob.getNumberSum(123));
    }
    
}
