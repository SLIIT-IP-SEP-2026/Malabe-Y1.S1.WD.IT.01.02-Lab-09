import java.util.Scanner;

public class IT26102098Lab9Q4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[5];
		
		double assignmentMarks[] = new double[5];
		double examMarks []= new double[5];
		double finalMarks []= new double[5];
		
		char[] grades = new char[5];
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println();
			System.out.print("Enter Name of Student " + (i + 1) + ": ");
			names[i] = input.nextLine();
			
			System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
			assignmentMarks[i] = input.nextDouble();
			
			System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
			examMarks[i] = input.nextDouble();
			input.nextLine();
			
		    finalMarks[i] = calcFinalMark(assignmentMarks[i], examMarks[i]);
			grades[i] = findGrades (finalMarks[i]);
			
		}
		
		System.out.println();
		
		System.out.println("Name\t\tFinal Mark\tGrade");
		
	    for (int i = 0; i < 5; i++) {
			
			printDetails(names[i], finalMarks[i], grades[i]);
		}
	}
	
	public static double calcFinalMark(double assignmentMarks, double examMarks) {
		
		return (assignmentMarks * 0.3) + (examMarks * 0.7);
	}
	
	public static char findGrades(double finalMark) {
		
		if (finalMark >= 75) {
			return 'A';
			
		} else if (finalMark >= 60) {
			return 'B';
		
		} else if (finalMark >= 50) {
			return 'C';
			
		} else {
			return 'F';
		}
	}
	
	public static void printDetails(String name, double finalMark, char grade) {
		
		System.out.println(name + "\t\t" + String.format("%.2f", finalMark) + "\t\t" + grade);
	}
}