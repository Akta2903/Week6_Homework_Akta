package week6homeworkjavaprograms;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

public class Program5
{
    public static void main(String[] args)
    {
        Program5 obj = new Program5(); // created object to call th instance methods
        addition(10,20); //method calling
        subtraction(10,20);
        obj.multiplication(20,30);
        obj.division(60,30);

        //System.out.println("The addition of a and b is :  " + );
    }
    public static void  addition(int a,int b) // static method
    {
        int c= a+b; // addition of two number
        System.out.println("The addition of a and b is: "+ c);
        //return c;
    }
    public static void subtraction(int a, int b ) //declaring static method
    {
        int c = a-b; // Subtraction of two number
        System.out.println("The subtraction of a and b is: " + c);
        //return c;
    }
    public void multiplication(int a, int b) // declaring Instance method
    {
        int c = a*b; // multiplication of two number
        System.out.println("The multiplication of a and b is: " + c);
        //return c;
    }
    public void division(int a, int b)
    {
        double c= a/b; //division  of two numbers
        System.out.println("The division of a and b is: " + c);
        //return c;
    }
}
