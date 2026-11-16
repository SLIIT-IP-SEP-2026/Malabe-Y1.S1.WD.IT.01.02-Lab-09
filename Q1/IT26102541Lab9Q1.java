import java.util.Scanner;

public class IT26102541Lab9Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double a, b, c, x1, x2, d;

        System.out.print("Enter value for a: ");
        a = input.nextDouble();

        System.out.print("Enter value for b: ");
        b = input.nextDouble();

        System.out.print("Enter value for c: ");
        c = input.nextDouble();

        d = Math.pow(b, 2) - (4 * a * c);

        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);
		
		System.out.println();
        System.out.println("Roots are real and different: ");
        System.out.println("Root 1 : " + x1);
        System.out.println("Root 2 : " + x2);
    }
}