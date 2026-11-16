import java.util.Scanner;
public class IT26102061Lab9Q1{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value a :");
		double valueA=input.nextDouble();
		
		System.out.print("Enter value b :");
		double valueB=input.nextDouble();
		
		System.out.print("Enter value c :");
		double valueC=input.nextDouble();
		
		System.out.println("\nRoots are real and different :");
		
		roots(valueA,valueB,valueC);
	}
	
	//methods 
	
	public static void roots(double a,double b,double c){
		
		double root1,root2;
		
		root1= (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		root2= (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		
		System.out.println("Root 1 : "+root1+"\nRoot 2 : "+root2);
	}
}
		
		
		