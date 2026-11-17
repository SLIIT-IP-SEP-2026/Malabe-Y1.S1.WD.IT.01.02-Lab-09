
import java.util.Scanner;

public class IT26102686Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        double finalMark;

        finalMark = (assignment * 0.30) + (exam * 0.70);

        return finalMark;
    }

    public static String findGrades(double mark) {

        if (mark >= 75) {
            return "A";
        }
        else if (mark >= 60) {
            return "B";
        }
        else if (mark >= 50) {
            return "C";
        }
        else {
            return "F";
        }
    }

    public static void printDetails(String name, double mark, String grade) {

        System.out.printf("%-15s %-15.2f %-10s%n", name, mark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] assignmentMarks = new double[5];
        double[] examMarks = new double[5];

        double finalMark;
        String grade;

        // Enter details of all five students

        for (int i = 0; i < 5; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            assignmentMarks[i] = input.nextDouble();

            System.out.print("Enter Exam Paper Mark: ");
            examMarks[i] = input.nextDouble();

            input.nextLine();
        }

        // Display details of all five students

        System.out.println("\nName            Final Mark      Grade");

        for (int i = 0; i < 5; i++) {

            finalMark = calcFinalMark(assignmentMarks[i], examMarks[i]);

            grade = findGrades(finalMark);

            printDetails(names[i], finalMark, grade);
        }

        input.close();
    }
}
