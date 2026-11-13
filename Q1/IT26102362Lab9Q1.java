import java.util.Scanner;
public class IT26102362Lab9Q1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		double X1, X2;
		
		System.out.print("Enter Value a: ");
		double a = input.nextDouble();
		
		System.out.print("Enter Value b: ");
		double b = input.nextDouble();
		
		System.out.print("Enter Value c: ");
		double c = input.nextDouble();
		
		X1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		X2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		
		System.out.println("Roots are real and different : ");
		System.out.printf("Root 1: %.2f\n", X1);
		System.out.printf("Root 2: %.2f\n", X2);
	}
}