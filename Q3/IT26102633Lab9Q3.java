
public class IT26102633Lab9Q3 {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to square an integer
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        int result1, result2;

        result1 = square(add(multiply(3, 4), multiply(5, 7)));

        result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)²    : " + result1);

        System.out.println("Result of (4 + 7)² + (8 + 3)² : " + result2);
    }
}
