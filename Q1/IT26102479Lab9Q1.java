import java.util.Scanner;

public class IT26102479Lab9Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = input.nextDouble();

        System.out.print("Enter value b: ");
        double b = input.nextDouble();

        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        if (a == 0) {
            System.out.println("Not a quadratic equation (a cannot be 0).");
            input.close();
            return;
        }

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double sqrtDisc = Math.sqrt(discriminant);
            double root1 = (-b + sqrtDisc) / (2 * a);
            double root2 = (-b - sqrtDisc) / (2 * a);

            System.out.println("Roots are real and different :");
            System.out.printf("Root 1: %.2f%n", root1);
            System.out.printf("Root 2: %.2f%n", root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal :");
            System.out.printf("Root 1: %.2f%n", root);
            System.out.printf("Root 2: %.2f%n", root);
        } else {
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and different :");
            System.out.printf("Root 1: %.2f + %.2fi%n", realPart, imagPart);
            System.out.printf("Root 2: %.2f - %.2fi%n", realPart, imagPart);
        }

        input.close();
    }
}