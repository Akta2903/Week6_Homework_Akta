package week6homeworkjavaprograms;

import java.util.Scanner;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

public class Program13
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in); // used for inputs
        System.out.print("Enter the first value : ");
        double a = scan.nextDouble();
        System.out.print("Enter the first value : ");
        double b = scan.nextDouble();
        System.out.print("Enter the first value : ");
        double c = scan.nextDouble();
        Program13 obj = new Program13(); // object creation to call the instance method
        obj.average(a,b,c); // calling average() method
        scan.close();

    }

    public  void average(double x,double y,double z) // instance method declaration
    {
        double answer = (x+y+z)/3;
        System.out.println("The average of x,y and z : " + answer);
    }
}
