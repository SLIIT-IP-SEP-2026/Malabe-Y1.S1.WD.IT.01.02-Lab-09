import java.util.Scanner;

public class IT26102530Lab9Q2 {

    public static void main(String[] args) {

        double radius;
        double area;

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input Radius of the Circle
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        // Call circleArea Method
        area = circleArea(radius);

        // Display the Area
        System.out.println("The area of the circle with radius "
                + radius + " is : " + area);

    }

    // Method to Calculate Circle Area
    public static double circleArea(double radius) {

        return Math.PI * Math.pow(radius, 2);
    }

}
