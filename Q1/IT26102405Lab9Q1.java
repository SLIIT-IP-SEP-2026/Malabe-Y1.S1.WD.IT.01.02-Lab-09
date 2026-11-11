import java.util.Scanner;

public class IT26102405Lab9Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double a, b, c;
		
		// takes user input for variables a, b, and c
		System.out.print("Enter value a: ");
		a = input.nextInt();
		System.out.print("Enter value b: ");
		b = input.nextInt();
		System.out.print("Enter value c: ");
		c = input.nextInt();
		
		// calculates the two roots using quadratic formula
		double result1 = ((b * -1) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		double result2 = ((b * -1) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		
		System.out.println();
		
		System.out.println("Roots are real and different :");
		System.out.println("Root 1: " + result1);
		System.out.println("Root 2: " + result2);
	}

}