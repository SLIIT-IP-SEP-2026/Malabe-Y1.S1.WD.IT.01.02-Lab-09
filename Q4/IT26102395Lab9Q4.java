
import java.util.Scanner;

public class IT26102395Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {

        double finalMark = (assignment * 0.30) + (exam * 0.70);

        return finalMark;
    }

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

    public static void printDetails(String name, double mark, String grade) {

        System.out.println("Student Name: " + name);
        System.out.println("Final Mark: " + mark);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Student " + (i + 1));

            System.out.print("Enter Name: ");
            String name = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Mark: ");
            double exam = input.nextDouble();

            input.nextLine();

            double finalMark = calcFinalMark(assignment, exam);

            String grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

        input.close();
    }
}

