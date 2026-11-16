public class IT26102641Lab9Q3 {
    public static void main(String[] args) {

        // i. (3 * 4 + 5 * 7)^2
		
        int first = multiply(3, 4);      // 12
        int second = multiply(5, 7);     // 35
        int total = add(first, second);  // 12 + 35 = 47
        int result1 = square(total);     // 47 * 47 = 2209

        System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + result1);

        // ii. (4 + 7)^2 + (8 + 3)^
		
        int part1 = square(add(4, 7));   // (11)^2 = 121
        int part2 = square(add(8, 3));   // (11)^2 = 121
        int result2 = add(part1, part2); // 121 + 121 = 242

        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + result2);
    }

    // Add two numbers and give back the answer
	
    public static int add(int a, int b) {
        return a + b;
    }

    // Multiply two numbers and give back the answer
	
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Multiply a number by itself and give back the answer
	
    public static int square(int a) {
        return a * a;
    }
}