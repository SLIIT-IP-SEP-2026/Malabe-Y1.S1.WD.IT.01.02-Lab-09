
import java.util.Scanner;

  public class IT26102487Lab9Q2 {

    public static void main(String[] args) {

        // Create a Scanner Object for input
        Scanner input = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Call the circleArea() method
        double area = circleArea(radius);

        // Display the result
        System.out.println("The area of the circle with radius "
                + radius + " is : " + area);

        input.close();
    }

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {

        return Math.PI * Math.pow(radius, 2);

    }

}
