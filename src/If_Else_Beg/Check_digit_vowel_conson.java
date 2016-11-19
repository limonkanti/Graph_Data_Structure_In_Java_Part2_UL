
package If_Else_Beg;

import java.util.Scanner;

public class Check_digit_vowel_conson
{
     public static void main(String args[]) {
        System.out.println("Please enter a number");
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
     //   ch=sc.next().charAt(0);
        if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')||(ch=='a')||(ch=='a')||(ch=='a')||(ch=='a')||(ch=='a'))
        {
            System.out.println("Vowel");
            
        }
        else if(ch=='0'||(ch=='1')||(ch=='2')||(ch=='3')||(ch=='4')||(ch=='5')||(ch=='6')||(ch=='7')||(ch=='8')||(ch=='9'))
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Consonant");
        }

       

        }

    
}
