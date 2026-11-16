import java.util.Scanner;

public class IT26102641Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = input.nextDouble();
		
        System.out.print("Enter value b: ");
        double b = input.nextDouble();
		
        System.out.print("Enter value c: ");
        double c = input.nextDouble();
		
		double discriminant = b * b - 4 * a * c;

		if (discriminant > 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

			System.out.println("Roots are real and different : ");
			System.out.println("Root 1: " + root1);
			System.out.println("Root 2: " + root2);

		} else if (discriminant == 0) {
			double root = -b / (2 * a);

			System.out.println("Roots are real and equal : ");
			System.out.println("Root 1: " + root);
			System.out.println("Root 2: " + root);

		} else {
			System.out.println("Roots are not real");
		}
	}
}