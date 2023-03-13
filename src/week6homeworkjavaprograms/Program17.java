package week6homeworkjavaprograms;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 *
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 *
 * Binary number is: 101
 */

public class Program17
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // to enter the inputs
        System.out.println("Enter the Decimal value : " );
        int decimalNo = scan.nextInt(); // enter the input
        String binaryNo = Integer.toBinaryString(decimalNo); // to convert the decimal value into binary value
        System.out.println("The binary value for decimal number is : " + binaryNo); // printing the final output
        scan.close();
    }
}
