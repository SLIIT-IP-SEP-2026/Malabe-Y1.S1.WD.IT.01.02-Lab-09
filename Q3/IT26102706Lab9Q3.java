import java.util.Scanner;

public class IT26102706Lab9Q3 {

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int exponent(int num) {
        return num * num;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.println("Addition = " + add(a, b));

        System.out.println("Multiplication = "
                + multiply(a, b));

        System.out.println("Square of first number = "
                + exponent(a));

        input.close();
    }
}