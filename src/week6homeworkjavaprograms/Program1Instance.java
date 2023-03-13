package week6homeworkjavaprograms;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Program1Instance
{
    int a=10;
    int b=15;
    public static void main(String[] args)
    {
        Program1Instance obj = new Program1Instance();
        obj.program1();
    }
    public void program1()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
