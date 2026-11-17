import java.util.Scanner;

public class IT26102049Lab9Q4 {
    // a) Calculate final mark (30% assignment + 70% exam)
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // b) Determine grade based on final mark
    public static char findGrades(double mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // c) Print formatted details of a student
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-15.2f %c\n", name, finalMark, grade);
    }

    // d) Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignMark = sc.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = sc.nextDouble();
            System.out.println();

            finalMarks[i] = calcFinalMark(assignMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
        }

        // Print Table Header
        System.out.printf("%-15s %-15s %s\n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}