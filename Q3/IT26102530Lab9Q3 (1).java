public class IT26102530Lab9Q3 {

    public static void main(String[] args) {

        int result1, result2;

        // Calculate First Expression
        result1 = square(add(multiply(3, 4), multiply(5, 7)));

        // Calculate Second Expression
        result2 = add(square(add(4, 7)), square(add(8, 3)));

        // Display Results
        System.out.println("Result of (3 * 4 + 5 * 7)²      : "
                + result1);

        System.out.println("Result of (4 + 7)² + (8 + 3)² : "
                + result2);

    }

    // Method to Add Two Integers
    public static int add(int num1, int num2) {

        return num1 + num2;
    }

    // Method to Multiply Two Integers
    public static int multiply(int num1, int num2) {

        return num1 * num2;
    }

    // Method to Calculate Square
    public static int square(int number) {

        return number * number;
    }

}
