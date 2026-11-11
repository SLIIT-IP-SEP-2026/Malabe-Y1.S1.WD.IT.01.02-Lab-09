public class IT26102405Lab9Q3 {
	
	// takes in two numbers and returns the sum of the two numbers
	public static int add(int num1, int num2) {
		return num1 + num2;
		
	}
	
	// takes in two numbers and returns the product of the two numbers
	public static int multiply(int num1, int num2) {
		return num1 * num2;
		
	}
	
	// takes in one number and retunrs the squared value 
	public static int square(int base) {
		return base * base;
		
	}

	public static void main(String[] args) {
	
		// (3*4 + 5*7)^2
		// (4+7)^2 + (8+3)^2
		
		int output = 0;
	
		System.out.print("Result of (3 * 4 + 5 * 7)^2\t\t: ");
		output = square(add(multiply(3, 4), multiply(5, 7)));
		System.out.println(output);
		
		output = 0;
		System.out.print("Result of (4 + 7)^2 + (8 + 3)^2\t\t: ");
		output = add(square(add(4,7)), square(add(8,3)));
		System.out.println(output);
	
	}

}