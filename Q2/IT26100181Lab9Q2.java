import java.util.Scanner;
public class IT26100181Lab9Q2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Getting the inputs to radius...
		System.out.print("Enter the radius of the circle : ");
		double radius = input.nextInt();
		
		double cArea = circleArea(radius);
		
		//Printing the area of the circle...
		System.out.println("The area of the circle with redius "+ radius + " is : " + cArea);
	}
	
	//Making a method to calculate the area of a circle...
	public static double circleArea(double r){
		double cArea = Math.PI * Math.pow(r,2);
		return cArea;
	}	
}
