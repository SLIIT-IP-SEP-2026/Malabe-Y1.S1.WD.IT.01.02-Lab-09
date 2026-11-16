import java.util.Scanner;
public class IT26102460Lab9Q4{
	//Method to calculate the final mark
	public static double calcFinalMark(double assignmentMark, double examMark){
		return (assignmentMark * 0.3) + (examMark* 0.7);
	}
	//Method to find grades
	public static char findGrades(double finalMark){
		if(finalMark >= 75){
			return 'A';
		}
		else if(finalMark >= 60){
			return 'B';
		}
		else if(finalMark >= 50){
			return 'C';
		}
		else{
			return 'F';
		}
	}
	//Method to print grades and details
	public static void printDetails(String name, double finalMark, char grade){
		System.out.print(name + "\t\t" + finalMark + "\t\t" + grade);
	}
	//Printing all the details
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double assignmentMark, examMark;
		
		System.out.println("Name\t\tFinal Mark\tGrade");
		
		for(int i=1; i <= 5; i++){
		
		System.out.println("\nStudent" + i);
		System.out.print("Enter Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Assignment mark: ");
		assignmentMark = input.nextDouble();
		
		System.out.print("Enter Exam mark: ");
		examMark = input.nextDouble();
		input.nextLine();
		
		double finalMark = calcFinalMark(assignmentMark, examMark);
		char grade = findGrades(finalMark);
		
		printDetails(name, finalMark, grade);
		}
	}
}
