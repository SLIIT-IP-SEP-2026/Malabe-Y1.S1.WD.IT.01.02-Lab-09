public class IT26102567Lab9Q3 {

    // Method to add two integers and return the result
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to multiply two integers and return the result
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to square an integer and return the result
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // i. (3 * 4 + 5 * 7)^2
        int part1 = multiply(3, 4);
        int part2 = multiply(5, 7);
        int sum1 = add(part1, part2);
        int result1 = square(sum1);

        // ii. (4 + 7)^2 + (8 + 3)^2
        int firstSquare = square(add(4, 7));
        int secondSquare = square(add(8, 3));
        int result2 = add(firstSquare, secondSquare);

        System.out.println("Result of (3 * 4 + 5 * 7) ^ 2        : " + result1);
        System.out.println("Result of (4 + 7) ^ 2 + (8 + 3) ^ 2  : " + result2);
    }
}