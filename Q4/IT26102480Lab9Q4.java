import java.util.Scanner;
public class IT26102480Lab9Q4{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		//create string array
		String name[]= new String[5];
		
		//create double array
		double assignmentMarks[]= new double[5];
		double examMarks [] = new double[5];
		double finalMarks []= new double [5] ;
		
		// Create Char Array
		char [] grades = new char [5];
		
		// Input for 5 students
		for (int i = 0; i < 5; i++) {
			System.out.println();
			System.out.print("Enter Name of Student " + (i + 1) + ": ");
			name[i] = input.nextLine();
			
			System.out.print("Enter Assignment Mark (out of 100) for " + name[i] + ": ");
			assignmentMarks[i] = input.nextDouble();
			
			System.out.print("Enter Exam Paper Mark (out of 100) for "+ name[i] + ": ");
			examMarks[i]=input.nextDouble();
			input.nextLine();
			
			//calculate fimal marks and grade
			finalMarks [i] = calcFinalMark(assignmentMarks [i], examMarks [i]);
			grades [i] = findGrades(finalMarks[i]);
		}
		
		System.out.println();
		
		//create table header
		System.out.println("Name\t\tFinal Mark\tGrade");
		
		//add student details
		for (int i = 0; i < 5; i++) {
			
			printDetails(name[i], finalMarks[i], grades[i]); //call printDetails Method
			
		}
		
	}
	
	//method to calculate final marks
	public static double calcFinalMark(double assignmentMarks,double examMarks){
		return (assignmentMarks * 0.3) + (examMarks * 0.7);
	}
	
	// Method to find final grade
	public static char findGrades (double finalMarks) {
		
		if (finalMarks >= 75) {
			return 'A' ;
		}
		else if (finalMarks >= 60) {
			return 'B';
		}
		else if (finalMarks >= 50) {
			return 'C';
		}
		else {
			return 'F';
		}
	}
	
	// Method to print student details
	public static void printDetails (String name, double finalMarks, char grade) {
		System.out.println(name + "\t\t" + String.format("%.2f", finalMarks) + "\t\t" + grade) ;
	}
	
}
