package week6homeworkjavaprograms;

import java.util.Scanner;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Program18
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // to enter the input values
        System.out.print("Enter the First value: ");
        int value1 = scan.nextInt();
        System.out.print("Enter the Second value: ");
        int value2 = scan.nextInt();

        Program18 obj = new Program18(); // object creation for calling instance method
        obj.calculations(value1,value2); // calling calculation() method
        scan.close();
    }
    public void calculations(int x, int y) // declaring calculation() method as instance
    {
        int add, subtraction,multi,mod;
        int division;
        add = x + y;
        subtraction = x - y;
        multi = x * y;
        division = x/y;
        mod = x % y;
        // printing the final outputs
        System.out.println("The addition of two number is : " + add);
        System.out.println("The subtraction of two number is : " + subtraction);
        System.out.println("The multiplication of two number is : " + multi);
        System.out.println("The division of two number is : " + division);
        System.out.println("The mod  of two number is : " + mod);


    }
}
