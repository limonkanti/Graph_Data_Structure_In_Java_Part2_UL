
package loopPrograms;

import java.util.Scanner;

public class Number_to_Words
{
    public static void main(String args[])
    {
        System.out.println("Please Enter the range");
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int mod,div=0,i=0;
        int a[]=new int[10];
        while(n!=0)
        {
            mod=n%10;
            i++;
            a[i]=mod;
            n=n/10;
            
        }
        
        for(int j=i;j>=1;j--)
        {
           // System.out.print(a[j]+"\t");
            switch(a[j])
            {
                case 1:
                   System.out.print("One"+"\t"); 
                    break;
                    case 2:
                   System.out.print("Two"+"\t"); 
                   break;
                        case 3:
                   System.out.print("Three"+"\t"); 
                    break;
                            
                            case 4:
                   System.out.print("Four"+"\t"); 
                    break;
                            default:
                             System.out.print("Not");    
                           break;     
                
            }
        }
        
        
    }
    
}
