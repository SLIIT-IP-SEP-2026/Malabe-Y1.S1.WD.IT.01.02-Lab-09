import java.util.Scanner;

public class IT26102456Lab9Q4 {

    // a) Calculate final mark - 30% assignment + 70% exam
    public static double calcFinalMark(double assignment, double exam) {
        return assignment * 0.30 + exam * 0.70;
    }

    // b) Find grade for final mark
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

    // c) Print details of a student
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println(name + "\t\t" + finalMark + "\t\t" + grade);
    }

    // d) Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Name\t\tFinal Mark\tGrade");
        System.out.println("--------------------------------");

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nStudent " + i);
            System.out.print("Enter Name: ");
            String name = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100): ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100): ");
            double exam = input.nextDouble();
            input.nextLine(); // clear buffer

            double finalMark = calcFinalMark(assignment, exam);
            char grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }
    }
}