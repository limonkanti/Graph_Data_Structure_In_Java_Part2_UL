package interview_coding_java2novice;


public class Check_Binary 
{

    void testBinary(int n)
    {
        boolean isBinary=true;
        int number=n;
        while(number!=0)
        {
            int temp=number%10;
            if(temp>1)
            {
                isBinary=false;
                break;
            }
            else
            {
                number=number/10;
            }
            
        }
        if(isBinary)
        {
            System.out.println("Yes!!!!Binary number.");
        }
        else
        {
            System.out.println("Not!!!!It is not a Binary number.");
        }
    }
    
     public static void main(String[] args)
     {
         Check_Binary ob=new Check_Binary();
         ob.testBinary(120011);
         // ob.testBinary(110011);
         
     }
    
}
