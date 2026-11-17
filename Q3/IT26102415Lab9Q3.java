public class IT26102415Lab9Q3
{
	public static void main(String[]args)
	{
		int result1 = square(add(multiply(3, 4), multiply(5, 7)));
		System.out.println("Result of (3 * 4 + 5 * 7)²     : " + result1);
		int result2 = add(square(add(4, 7)), square(add(8, 3)));
		System.out.println("Result of (4 + 7)² + (8 + 3)²  : " + result2);
	}
	public static int add(int a,int b)
	{
		 int result = a + b;
		 return result;
	}
	public static int multiply(int a, int b)
	{
		int result= a*b;
		return result;
	}
	public static int square(int n)
	{
		int result=n*n;
		return result;
	}
}