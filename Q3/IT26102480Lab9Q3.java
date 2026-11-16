public class IT26102480Lab9Q3 {

    public static void main(String[] args) {
		
        //calculate  (3 * 4 + 5 * 7)^2
        int r1 = square(add(multiply(3, 4), multiply(5, 7)));

        // calculate (4 + 7)^2 + (8 + 3)^2
        int r2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)^2      : " + r1);
        System.out.println("Result of (4 + 7)\u00B2 + (8 + 3)^2  : " + r2);
    }
	//create add method
	 public static int add(int a, int b) {
        return a + b;
    }
	//create multiply method
    public static int multiply(int a, int b) {
        return a * b;
    }
	//create squre value method
    public static int square(int a) {
        return multiply(a, a);
    }
}