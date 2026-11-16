import java.util.Scanner;
public class IT26102460Lab9Q2{
	public static double circleArea(double radius){
		//Calculate Area
		//Math.PI is inbuilt funciton fo pi instead of using 22/7
		return Math.PI* Math.pow(radius, 2); //remember this
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		
		//Printing the area
		System.out.print("The area is: " + circleArea(radius));
	}
}