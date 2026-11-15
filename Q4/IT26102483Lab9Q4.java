import java.util.Scanner;
public class IT26102483Lab9Q4
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		String[] name = new String[5];
        double[] finalMark = new double[5];
        String[] grade = new String[5];
		for(int i = 0; i < 5; i++)
        {
			System.out.print("\nEnter Name of Student " + (i + 1) + ": ");
			name[i] = input.nextLine();
			System.out.print("Enter Assignment Mark (out of 100) for " + name[i] + ": ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + name[i] + ": ");
            double examMark = input.nextDouble();

            input.nextLine();

            finalMark[i] = calcFinalMark(assignmentMark, examMark);
            grade[i] = findGrades(finalMark[i]);
        }

        System.out.printf("%-10s %-15s %-5s\n", "Name", "Final Mark", "Grade");

        for(int i = 0; i < 5; i++)
        {
            System.out.printf("%-10s %-15.2f %-5s\n",name[i], finalMark[i], grade[i]);
		}
	}

	//Method to calculate final mark
	public static double calcFinalMark(double assignmentMark, double examMark)
	{
		   return (assignmentMark * 0.30) + (examMark * 0.70);
	}
	// Method to find grade
	 public static String findGrades(double finalMark) {
        if (finalMark >= 75)
            return "A";
        else if (finalMark >= 60)
            return "B";
        else if (finalMark >= 50)
            return "C";
        else
            return "F";
    }
}
		   
		
		 