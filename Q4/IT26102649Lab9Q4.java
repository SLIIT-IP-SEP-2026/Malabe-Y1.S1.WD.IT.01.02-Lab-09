
import java.util.Scanner;

public class IT26102649Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        double finalMark = assignment * 0.3 + exam * 0.7;
        return finalMark;
    }

    public static char grade(double finalMark) {

        if (finalMark >= 75) {
            return 'A';
        }
        else if (finalMark >= 60) {
            return 'B';
        }
        else if (finalMark >= 50) {
            return 'C';
        }
        else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char Grade) {
        System.out.println(name + " " + finalMark + " " + Grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        char[] grades = new char[5];
        double[] finalMarks = new double[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter assignment mark: ");
            double assignmentMarks = input.nextDouble();

            System.out.print("Enter exam mark: ");
            double examMarks = input.nextDouble();

            input.nextLine();

            finalMarks[i] = calcFinalMark(assignmentMarks, examMarks);

            grades[i] = grade(finalMarks[i]);
        }

        System.out.println("\nStudent Details:");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        
    }
}
