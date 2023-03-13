package week6homeworkjavaprograms;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Program9
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // Used scanner object to input the values
        System.out.println("Enter the string  : ");
       // String nameUpper = scan.nextLine(); //
      //  System.out.println("The string in uppercase is : ");
        String nameLower = scan.nextLine();
        // System.out.println("string in uppercase is: "+ nameUpper.toUpperCase());
        System.out.println("The string in Lowercase is : " + nameLower.toLowerCase()); // returns the output in lower case
        scan.close();



    }
}
