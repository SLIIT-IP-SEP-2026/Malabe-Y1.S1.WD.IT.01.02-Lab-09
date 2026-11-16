import java.util.Scanner;

public class IT26102706Lab9Q4 {

    // Calculate final mark
    static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
    }

    // Find grade
    static char findGrade(double mark) {

        if (mark >= 75) {
            return 'A';
        }
        else if (mark >= 60) {
            return 'B';
        }
        else if (mark >= 50) {
            return 'C';
        }
        else {
            return 'F';
        }
    }

    // Print student details
    static void printDetails(String name, double mark, char grade) {

        System.out.printf("%-15s %-15.2f %-10c%n",
                name, mark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] assignment = new double[5];
        double[] exam = new double[5];
        double[] finalMark = new double[5];
        char[] grade = new char[5];

        // Input details of 5 students
        for (int i = 0; i < 5; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            assignment[i] = input.nextDouble();

            System.out.print("Enter Exam Paper Mark: ");
            exam[i] = input.nextDouble();

            input.nextLine();

            finalMark[i] = calcFinalMark(
                    assignment[i], exam[i]);

            grade[i] = findGrade(finalMark[i]);
        }

        // Display student details
        System.out.println("\nName           Final Mark      Grade");

        for (int i = 0; i < 5; i++) {

            printDetails(names[i],
                    finalMark[i], grade[i]);
        }

        input.close();
    }
}