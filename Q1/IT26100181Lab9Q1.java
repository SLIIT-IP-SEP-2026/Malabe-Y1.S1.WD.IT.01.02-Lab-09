import java.util.Scanner;
public class IT26100181Lab9Q1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Getting inputs...
		System.out.print("Enter value a : ");
		int a = input.nextInt();
		
		System.out.print("Enter value b : ");
		int b = input.nextInt();
		
		System.out.print("Enter value c : ");
		int c = input.nextInt();
		
		System.out.println();
		System.out.println("Roots are real and different : ");
		double root1  = getRoot1(a,b,c);
		double root2  = getRoot2(a,b,c);
		
		
		//Printing the x values...
		System.out.printf("Root 1: %.2f\n",root1);
		System.out.printf("Root 2: %.2f",root2);
	}
	
	//Making a method to take inputs and calculate the x value...
	public static double getRoot1(int a,int b,int c){
		
		double x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2.0*a);
		return x1;
	}
	
	public static double getRoot2(int a,int b,int c){
		
		double x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2.0*a);
		return x2;
	}
	
	
}
