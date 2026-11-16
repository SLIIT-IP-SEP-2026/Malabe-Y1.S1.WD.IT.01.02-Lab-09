import java.util.Scanner;

public class IT26102706Lab9Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c;
        double d, x1, x2;

        System.out.print("Enter value a: ");
        a = input.nextDouble();

        System.out.print("Enter value b: ");
        b = input.nextDouble();

        System.out.print("Enter value c: ");
        c = input.nextDouble();

        d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            System.out.println("Roots are real and different!");

            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.printf("Root 1: %.2f%n", x1);
            System.out.printf("Root 2: %.2f%n", x2);

        } else if (d == 0) {
            System.out.println("Roots are real and equal!");

            x1 = -b / (2 * a);

            System.out.printf("Root: %.2f%n", x1);

        } else {
            System.out.println("Roots are imaginary!");
        }

        input.close();
    }
}