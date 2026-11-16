
import java.util.Scanner;

public class IT26102633Lab9Q4 {

    // Method to calculate final mark
    public static double calcFinalMark(double assignment, double exam) {

        double finalMark = (assignment * 0.30) + (exam * 0.70);

        return finalMark;
    }

    // Method to find grade
    public static String findGrades(double mark) {

        if (mark >= 75) {
            return "A";
        } else if (mark >= 60) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Method to print student details
    public static void printDetails(String name, double finalMark, String grade) {

        System.out.printf("%-15s %-15.2f %-10s%n",
                name, finalMark, grade);
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        double assignment, exam;

        // Get details of 5 students
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for "
                    + names[i] + ": ");
            assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + names[i] + ": ");
            exam = input.nextDouble();

            input.nextLine();

            finalMarks[i] = calcFinalMark(assignment, exam);

            grades[i] = findGrades(finalMarks[i]);
        }

        // Display student details
        System.out.println("\nName            Final Mark     Grade");

        for (int i = 0; i < 5; i++) {

            printDetails(names[i], finalMarks[i], grades[i]);

        }

        input.close();
    }
}

