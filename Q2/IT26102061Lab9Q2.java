import java.util.Scanner;
public class IT26102061Lab9Q2{
	public static double circleArea(double r){
		double radius;
		
		radius= Math.PI*Math.pow(r,2);
		
		return radius;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter radius of the circle : ");
		double radius=input.nextDouble();
		
		System.out.println("The area of the circle with radius "+radius+" is : "+circleArea(radius));
	}
}
	