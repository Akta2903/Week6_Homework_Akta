package week6homeworkjavaprograms;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program3StaticInstance {
    int variable1 = 10; //declaring instance variable
    static int variable2 = 20; //declaring static variable

    public static void main(String[] args)
    {
        program2_2();
        Program3StaticInstance obj = new Program3StaticInstance();
        obj.program2_1();

    }

    public void program2_1()
    {
        Program3StaticInstance obj = new Program3StaticInstance();
        System.out.println("The value for Instance variable is: "+ variable1);
        System.out.println("The value for Static variable is: "+ obj.variable2);
    }
    public static void program2_2()
    {
        Program3StaticInstance obj = new Program3StaticInstance();
        System.out.println("The Value for instance variable is: " + obj.variable1);
        System.out.println("The value for Static variable is: " + variable2);
    }

}
