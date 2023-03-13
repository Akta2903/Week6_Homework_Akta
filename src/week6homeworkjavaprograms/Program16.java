package week6homeworkjavaprograms;
/**
 * 16. Write a Java program to add two binary numbers.
 *
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 *
 * Sum of two binary numbers: 101
 */

import java.util.Scanner;

public class Program16
{
    public static void main(String[] args) // declaring main method
    {
        Scanner scan = new Scanner(System.in); // used for the input the value
        System.out.print("Enter the First value : ");
        String value1 = scan.nextLine();
        System.out.print("Enter the second value : ");
        String value2 = scan.nextLine();
        int num1 = Integer.parseInt(value1,2); // converts the strings into integer
        int num2 = Integer.parseInt(value2,2);
        int n3= num1 + num2; // addition of two numbers
        //System.out.println(Integer.toBinaryString(num1));
        //System.out.println(Integer.toBinaryString(num2));
        System.out.println("The sum of two binary number is: " + Integer.toBinaryString(n3)); // converts the integer into binary strings
        scan.close();


    }

}
