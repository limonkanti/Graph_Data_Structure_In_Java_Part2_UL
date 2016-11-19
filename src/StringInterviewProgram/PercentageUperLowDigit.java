package StringInterviewProgram;

public class PercentageUperLowDigit 
{
    public void perchanTest(String s)
    {
        int length=s.length();
        int upperCaseLetters = 0;
        int lowerCaseLetters = 0;
        int digits = 0;
        int others = 0;
        for(int i=0;i<length;i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                upperCaseLetters++;
                
            }
            else if(Character.isLowerCase(ch))
            {
                lowerCaseLetters++;
            }
            else if(Character.isDigit(ch))
            {
                     digits++;   
            }
            else
            {
                others++;
            }
            
            
        }
        double upperCasePerchantage=(upperCaseLetters*100)/length;
        System.out.println("Total Length:\t"+length);
        System.out.println(upperCasePerchantage+"%");
    }
    public static void main(String args[])
    {
        PercentageUperLowDigit ob=new PercentageUperLowDigit();
        ob.perchanTest("Limon Kanti dey 11111 ,,,,,,,");
        
    }
}
