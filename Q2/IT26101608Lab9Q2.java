import java.util.Scanner;
public class IT26101608Lab9Q2{
   
   public static double circleArea(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double radius, result;

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        result = circleArea(radius);

        System.out.println("The area of the circle with radius " + radius + " is : " + result);
    }
}