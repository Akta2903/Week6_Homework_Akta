package week6homeworkjavaprograms;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 * Triangle (A) = ½ bh
 */

public class Program8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ; // To input the value Scanner class is used
        double b,h,area;
        System.out.println("Enter the base value of the triangle in cm : " );
        b=scan.nextDouble(); // enter the value of base
        System.out.println("Enter the height of the triangle in cm : ");
        h=scan.nextDouble(); // enter the value of height of triangle
        area = (b*h)/2; // formula for triangle area calculation
        System.out.println("The area of the triangle is : " + area +"sq.cm");
        scan.close();



    }

}
