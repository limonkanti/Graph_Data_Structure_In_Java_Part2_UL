
package StringProgramms;


public class StringPerchantageUprLchar 
{
    public static void main(String[] args) 
    {
        String s="LimonKantiDey";
        char ch[]=s.toCharArray();
        int uppercaseCount=0,lowercaseCount=0;
        double length=s.length();
        for(int i=0;i<ch.length;i++)
        {
            if((ch[i]>='A'&&ch[i]<='Z'))
              {
                     uppercaseCount++;   
              }
            else
            {
                lowercaseCount++;
            }
        }
        System.out.println("Percentage of uppercase is\t"+((100*uppercaseCount)/length)+"%");
        System.out.println("Percentage of lowercase is\t"+((100*lowercaseCount)/length)+"%");
        
    }
    
}
