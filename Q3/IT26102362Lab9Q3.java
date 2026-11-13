public class IT26102362Lab9Q3{
	
	public static int add(int a,int b){
		return a+b;
	}
	public static int multiply(int a,int b){
		return a*b;
	}
	public static int square(int a){
		return a*a;
	}
	
	public static void main(String[]args){
		int expression01, expression02;
		
		expression01 = square(add(multiply(3,4),multiply(5,7)));
		expression02 = add(square(add(4,7)),square(add(8,3)));
		
		System.out.println("Result of (3*4 + 5*7)^2 : "+ expression01);
		System.out.println("Result of (4+7)^2 + (8+3)^2 : "+ expression02);
		
	}
}