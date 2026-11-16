public class IT26102406Lab9Q3 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        // Expression i: (3 * 4 + 5 * 7)^2
        int part1 = multiply(3, 4);
        int part2 = multiply(5, 7);
        int result1 = square(add(part1, part2));

        // Expression ii: (4 + 7)^2 + (8 + 3)^2
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)^2\t: " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2\t: " + result2);
    }
}