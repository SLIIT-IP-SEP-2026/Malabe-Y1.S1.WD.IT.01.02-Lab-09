import java.util.Scanner;
	public class IT26102649Lab9Q1{
	
		//Method1
		public static double calcDiscriminant(double a, double b, double c){
		return Math.pow(b,2)-4*a*c;
		}
		//Method2
		public static double calcRoot(double a, double b, double d, int sign){
		return (-b + sign*Math.sqrt(d)) / (2*a);
		}
		//Method3
		public static void printRoots(double a, double b, double c){
		 double d = calcDiscriminant(a,b,c);
		
		if(d>0){
			System.out.println("\nRoots are real and different : ");
			System.out.printf("Root 1: %.2f%n", calcRoot(a,b,d, +1));
			System.out.printf("Root 2: %.2f%n", calcRoot(a,b,d, -1));
		} else if(d == 0){
			System.out.println("\nRoots are real and equal : ");
			System.out.printf("Root 1 = Root 2 =: %.2f%n", calcRoot(a,b,d, +1));
		}else{
			System.out.println("\nRoots are imaginary (no real roots).");
		}
   }
		
		public  static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value a: ");
		double a = input.nextDouble();
		
		System.out.print("Enter value b: ");
		double b = input.nextDouble();
		
		System.out.print("Enter value c: ");
		double c = input.nextDouble();
		
		if(a == 0){
			System.out.println("Value of (a) cannot be 0 in a quadratic equation.");
		} else {
			printRoots(a,b,c);
		}	
	}
}