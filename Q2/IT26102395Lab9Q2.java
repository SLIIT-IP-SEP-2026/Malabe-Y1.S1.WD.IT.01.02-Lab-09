
import java.util.Scanner;

public class IT26102395Lab9Q2 {

    public static double circleArea(double radius) {

        double area = Math.PI * Math.pow(radius, 2);

        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = input.nextDouble();

        double result = circleArea(r);

        System.out.println("Circle Area = " + result);

        input.close();
    }
}
