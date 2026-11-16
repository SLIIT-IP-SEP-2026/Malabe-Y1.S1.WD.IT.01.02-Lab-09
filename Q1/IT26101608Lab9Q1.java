import java.util.Scanner;
public class IT26101608Lab9Q1{
    public static void main(String[] args){
        
		double a, b, c;
        double d, root1, root2;
		
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        a = input.nextDouble();
        System.out.print("Enter value b: ");
        b = input.nextDouble();
        System.out.print("Enter value c: ");
        c = input.nextDouble();

        d = Math.pow(b, 2) - 4 * a * c;

        System.out.println();

        if (d > 0) {
            
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Roots are real and different :");
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } else if (d == 0) {
    
            root1 = -b / (2 * a);

            System.out.println("Roots are real and equal :");
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root1);
        } else{            
            System.out.println("Roots are not real (no real solution)");
        }
    }
}