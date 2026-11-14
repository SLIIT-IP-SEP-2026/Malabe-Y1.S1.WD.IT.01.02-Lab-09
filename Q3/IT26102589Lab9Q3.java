public class IT26102589Lab9Q3 {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)²       : " + result1);
        System.out.println("Result of (4 + 7)² + (8 + 3)²   : " + result2);
    }
}