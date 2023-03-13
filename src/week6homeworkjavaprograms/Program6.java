package week6homeworkjavaprograms;

import java.util.Scanner;

/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

public class Program6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // to enter the input value for radius
        System.out.println("Enter the value of a radius value of a circle : ");
        double radius= scan.nextDouble(); // it allows to enter the input
        double area;
        //double pi=3.14;
        area=Math.PI*radius*radius;
        System.out.println("The area of a circle is: "+ area);
        scan.close();
    }
}
