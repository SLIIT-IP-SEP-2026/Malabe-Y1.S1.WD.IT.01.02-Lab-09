import java.util.Scanner;

public class IT26102641Lab9Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// Make 3 boxes to store 5 students' details
		
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];
		
		// Take input for 5 students

        for (int a = 0; a < 5; a++) {
            System.out.print("Enter Name of Student " + (a + 1) + ": ");
            names[a] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[a] + ": ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[a] + ": ");
            
			double exam = input.nextDouble();
            System.out.println();
			
			// Calculate final mark using method
			finalMarks[a] = calculateFinalMark(assignment, exam);
			
			// Find grade using method
            grades[a] = findGrades(finalMarks[a]);
        }
		
		// Print heading
		System.out.println("Name\t\tFinal Mark\tGrade");
		
		 // Print all students using method
        for (int a = 0; a < 5; a++) {
            printDetails(names[a], finalMarks[a], grades[a]);
        }
    }
	
	// Calculate final mark - 30% assignment + 70% exam

    public static double calculateFinalMark(double assignment, double exam) {
        return assignment * 0.30 + exam * 0.70;
    }
	
	// Find grade from final mark

    public static String findGrades(double finalMark) {
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 60) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
	
	// Print one student's details

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.println(name + "\t\t" + finalMark + "\t\t" + grade);
    }
}