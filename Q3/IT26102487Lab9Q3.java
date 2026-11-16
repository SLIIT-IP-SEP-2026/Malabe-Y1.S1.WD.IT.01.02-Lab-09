
public class IT26102487Lab9Q3 {

    public static void main(String[] args) {

        // Expression 1: (3 * 4 + 5 * 7)²
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));

        System.out.println("Result of (3 * 4 + 5 * 7)²    : " + result1);


        // Expression 2: (4 + 7)² + (8 + 3)²
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (4 + 7)² + (8 + 3)² : " + result2);

    }

    // Method to add two integers
    public static int add(int num1, int num2) {

        return num1 + num2;

    }

    // Method to multiply two integers
    public static int multiply(int num1, int num2) {

        return num1 * num2;

    }

    // Method to calculate the square of a number
    public static int square(int num) {

        return num * num;

    }

}
