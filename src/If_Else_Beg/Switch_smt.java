package If_Else_Beg;

import java.util.Scanner;

public class Switch_smt {

    public static void main(String args[]) {
        System.out.println("Please enter a number");
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();

   
        switch (a) 
        {
                case 80:
                System.out.println("You have gotten A+ grade");
                    break;
                    
                 case 70:
                System.out.println("You have gotten A grade");
                   break;  
                 case 60:
                System.out.println("You have gotten A- grade");
                   break;  
                   case 50:
                System.out.println("You have gotten B grade");
                   break;   
                    case 40:
                System.out.println("You have gotten C grade");
                   break; 
                          case(33):
                System.out.println("You have gotten D grade");
                   break;   
                              
                          default:
                            System.out.println("Failed");   
            
        }
            
                

        }

    }
