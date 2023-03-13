package week6homeworkjavaprograms;

import java.util.Scanner;

/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //pre-defined class is used to the input values
        System.out.println("Enter the temprature value in fahrenheit: " );
        double temp = scan.nextDouble();
        double temprature=((temp-32)*5)/9; // formula for converting the fahrenheit  temprature in celcius
        System.out.println("The temprature in celcius is: "+ temprature);
        scan.close();




    }
}
