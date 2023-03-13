package week6homeworkjavaprograms;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 *
 * Test Data:
 * Width = 5.5 Height = 8.5
 *
 * Expected Output:
 *
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Program14
{
    public static void main(String[] args)
    {
        areaOfRectangle(); // calling areaOfRectangle() method
    }

    public static void areaOfRectangle() // static method declaration

    {
        double width=5.5;
        double height=8.5;
        double area,perimeter;
        area = width*height; // area calculation
        System.out.println("The area of the rectangle is : " + area); // output
        perimeter = 2*(width+height); // perimeter calculations
        System.out.println("The perimeter of the rectangle is : " + perimeter); // output
    }
}
