
import java.util.Scanner;

public class IT26102395Lab9Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        double d = Math.pow(b, 2) - (4 * a * c);

        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);

        input.close();
    }
}
