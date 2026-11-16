import java.util.Scanner;
public class IT26102460Lab9Q1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Input a, b, c values
		System.out.print("Enter value a: ");
		int a = input.nextInt();
		System.out.print("Enter value b: ");
		int b = input.nextInt();
		System.out.print("Enter value c: ");
		int c = input.nextInt();
		
		//b^2
		double squared_b = Math.pow(b, 2); 
		//b^2-4ac
		double inside_value = squared_b - (4*a*c);
		//Squareroot(inside value)
		double square_root = Math.sqrt(inside_value);
		//Root 1
		double root_1 = (-b - square_root)/(2*a);
		//Root 2
		double root_2 = (-b + square_root)/(2*a);
		
		//Printing Answer
		System.out.print("\nRoots are real and different: ");
		System.out.print("\nRoot 1: " + root_1);
		System.out.print("\nRoot 2: " + root_2);
	}
}
