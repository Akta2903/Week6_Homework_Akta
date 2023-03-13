package week6homeworkjavaprograms;

import java.util.Scanner;

/**
 * 19. Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class Program19
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // used for input values
        System.out.print("Enter the string in Uppercase : ");
        String name = scan.nextLine();
        upperToLower(name); //calling upperToLower() method
        scan.close();
    }

    public static void upperToLower(String s1) //declaring static method upperToLower
    {

        System.out.println("The Lowercase string is : " + s1.toLowerCase()); // printing final output in lowercase

    }

}
