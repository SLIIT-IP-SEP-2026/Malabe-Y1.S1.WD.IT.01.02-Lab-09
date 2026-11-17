import java.util.Scanner;
public class IT26102415Lab9Q4{

    //Calculate Final Mark
    public static double calcFinalMark(double assignment, double exam) {
        double finalMark = (assignment * 0.30) + (exam * 0.70);
        return finalMark;
    }

    //Find Grade
    public static char findGrade(double finalMark) {

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

   
// Method 3: Print Student Details
    public static void printDetails(String name, double finalMark, char grade) {

        System.out.printf("%-15s %-15.2f %-10c%n",
                name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        double assignment, exam;

        // Get details of 5 students
        for (int i = 0; i < 5; i++) {

            System.out.print("\nEnter Student Name: ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark: ");
            assignment = input.nextDouble();

            System.out.print("Enter Exam Mark: ");
            exam = input.nextDouble();

            // Calculate final mark
            finalMarks[i] = calcFinalMark(assignment, exam);

            // Find grade
            grades[i] = findGrade(finalMarks[i]);
        }

        // Display all student details

        System.out.printf("%-15s %-15s %-10s%n",
                "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {

            printDetails(names[i], finalMarks[i], grades[i]);

        }
}
}