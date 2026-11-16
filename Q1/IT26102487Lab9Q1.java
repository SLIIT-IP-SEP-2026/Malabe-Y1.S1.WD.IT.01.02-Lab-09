
import java.util.Scanner;

public class IT26102487Lab9Q1 {
    public static void main(String[] args) {

        // Declare the variables
        double a, b, c;
        double discriminant, root1, root2;

        // Create a Scanner Object for input
        Scanner input = new Scanner(System.in);

        // Input values for a, b and c
        System.out.print("Enter value a: ");
        a = input.nextDouble();

        System.out.print("Enter value b: ");
        b = input.nextDouble();

        System.out.print("Enter value c: ");
        c = input.nextDouble();

        // Check whether a is zero
        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
        } else {

            // Calculate the discriminant
            discriminant = Math.pow(b, 2) - 4 * a * c;

            // Check whether roots are real and different
            if (discriminant > 0) {

                root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                System.out.println("Roots are real and different :");
                System.out.printf("Root 1: %.2f%n", root1);
                System.out.printf("Root 2: %.2f%n", root2);

            } else if (discriminant == 0) {

                root1 = -b / (2 * a);

                System.out.println("Roots are real and equal :");
                System.out.printf("Root 1: %.2f%n", root1);
                System.out.printf("Root 2: %.2f%n", root1);

            } else {

                System.out.println("Roots are imaginary.");

            }
        }

        input.close();
    }
}
