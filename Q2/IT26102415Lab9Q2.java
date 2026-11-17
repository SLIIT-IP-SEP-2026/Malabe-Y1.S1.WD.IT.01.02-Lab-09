import java.util.Scanner;
public class IT26102415Lab9Q2
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
		double result = circleArea(radius);
		System.out.println("The area of the circle with radius " + radius + " is : " + result);
	}
		public static double circleArea(double radius)
		{
			 double area = Math.PI * radius * radius;
			 return area;
		}
}