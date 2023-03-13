package week6homeworkjavaprograms;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4
{
    int instanceVariable1=10; // declaring instance variables
    int instanceVariable2=20;
    static int staticVariable1 = 30; // declaring static variables
    static int staticVariable2 = 40;
    public static void main(String[] args) // declaring main method
    {
        Program4 obj = new Program4(); // obj created to call the instance method
        obj.instanceMethod(); // calling instance method
        staticMethod(); // calling static method

    }
    public static void staticMethod() // declaring static method
    {
        Program4 obj = new Program4();
        System.out.println("The instance variable1 is : " +obj.instanceVariable1 ); //calling instance variables
        System.out.println("The instance variable2 is : " +obj.instanceVariable2 );
        System.out.println("The Static variable1 is : " + staticVariable1 ); // calling static variables
        System.out.println("The instance variable2 is : " + staticVariable2);


    }
    public void instanceMethod() // instance variables
    {
        Program4 obj = new Program4();// object 'obj' created to call the static variables
        System.out.println("The instance variable1 is : " + instanceVariable1 );//calling instance variables
        System.out.println("The instance variable2 is : " + instanceVariable2 );
        System.out.println("The Static variable1 is : " + obj.staticVariable1 );//calling static varables
        System.out.println("The instance variable2 is : " + obj.staticVariable2);

    }
}
