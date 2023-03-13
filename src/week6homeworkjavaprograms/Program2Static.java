package week6homeworkjavaprograms;

/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class Program2Static
{
    static int a=10;// declaring static variable1
    static int b=20;// declaring variable 2
    public static void main(String[] args)
    {
      program2();
    }
  public static void program2()
  {
      System.out.println("The value for a is: "+a);//calling static variable1
      System.out.println("The value for bis: "+b);//calling static variable2
  }
}
