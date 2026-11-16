import java.util.Scanner;
public class IT26102480Lab9Q1{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter value a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value c: ");
        double c = sc.nextDouble();
		
		//calculate (b^2 - 4ac)
		double i = Math.pow(b, 2) - 4 * a * c;
		
		if(i>=0){
		double root1 = (-b + Math.sqrt(i)) / (2 * a);
        double root2 = (-b - Math.sqrt(i)) / (2 * a);
        System.out.println("\nRoots are real and different :");
        System.out.printf("Root 1: %.2f%n", root1);
        System.out.printf("Root 2: %.2f%n", root2);
		}
		
		else{
		System.out.println("Roots are not real");
		}
	}
}