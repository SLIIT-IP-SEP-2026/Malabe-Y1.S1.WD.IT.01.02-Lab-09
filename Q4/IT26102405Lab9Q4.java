import java.util.Scanner;

public class IT26102405Lab9Q4 {

	// method to calculate final marks from assignment mark and exam paper mark
	public static double calcFinalMark(int assignmentMark, int examMark) {
		return (assignmentMark * 0.3) + (examMark * 0.7);

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
	
	
	public static void printDetails(int noOfStudents, String[] name, double[] finalMark, char[] grade) {
		System.out.println("Name\t\tFinal Mark\tGrade");
		
		// prints all student names and their respective final mark and grade
		// output formatted to tabular form
		for (int i = 0; i < noOfStudents; i++) {
			System.out.println(name[i] + "\t\t" + finalMark[i] + "\t\t" + grade[i]);
		}
	}


	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println();
		final int STD_COUNT = 5;
		
		// creates arrays to store student name, and their respective assignment and exam paper marks
		String[] stdName = new String[STD_COUNT];
		int[] stdAssignmentMarks = new int[STD_COUNT];
		int[] stdExamMarks = new int[STD_COUNT];
		
		double[] stdFinalMarks = new double[STD_COUNT];
		char[] stdGrade = new char[STD_COUNT];
		
		// loops to get inputs of 5 students
		for (int stdNo = 0; stdNo < STD_COUNT; stdNo++) {
			System.out.print("Enter Name of Student " + (stdNo+1) + ": ");
			stdName[stdNo] = input.nextLine();
			
			System.out.print("Enter Assignment Mark (out of 100) for " + stdName[stdNo] + ": ");
			stdAssignmentMarks[stdNo] = input.nextInt();
			
			System.out.print("Enter Exam Paper Mark (out of 100) for " + stdName[stdNo] + ": ");
			stdExamMarks[stdNo] = input.nextInt();
			
			// ensures that in the next loop, the escape character \n doesn't get inputted as the name
			input.nextLine();
			
			// calculates final mark from stored assignment and exam paper marks
			// stores the final mark into respective array
			stdFinalMarks[stdNo] = calcFinalMark(stdAssignmentMarks[stdNo], stdExamMarks[stdNo]);
			
			// finds grade from final mark and stores into respective array
			stdGrade[stdNo] = findGrades(stdFinalMarks[stdNo]);
			
			System.out.println();
		}
		
		printDetails(STD_COUNT, stdName, stdFinalMarks, stdGrade);
		
		
	
	}
	
}