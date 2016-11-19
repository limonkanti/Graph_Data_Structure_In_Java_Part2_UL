package interview_coding_java2novice;

import java.util.Scanner;

public class Binary_to_Decimal {

    public static void main(String[] args) {

        int bin, dec = 0, k = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        bin = scanner.nextInt();
        while (bin != 0) {
            dec = dec + (bin % 10) * k;
            // extracting the last digit of a binary number and multiplying it with 2 <sup> digits place value</sup>
            k =k*2;
            bin=bin/10;    // removing the last digit of a binary number 
        }
        System.out.println("Decimal number = " + dec);
        /*
         Scanner input = new Scanner( System.in );
         System.out.print("Enter a binary number: ");
         String binaryString =input.nextLine();
         System.out.println("Output: "+Integer.parseInt(binaryString,2));
        
         */
    }
}
