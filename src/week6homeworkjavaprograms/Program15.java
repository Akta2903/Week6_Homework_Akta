package week6homeworkjavaprograms;

import java.util.Scanner;

public class Program15
{
    public static void main(String[] args) // declaring main method
    {
        Scanner scan = new Scanner(System.in); // to input the value
        System.out.print("Enter the value of a: ");
        int a = scan.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scan.nextInt();
        Program15 obj = new Program15(); // created obj object to call the instance method
        obj.swapNumbers(a,b);
        scan.close();

    }
    public void swapNumbers(int x,int y) //declaring instance method
    {
        int z= x; // number swapping
        x=y;
        y=z;
        System.out.println("The value of a after swap : " + x); //final output after swapping
        System.out.println("The value of b after swap : " + y);

    }

}
