import java.util.Scanner;
public class IT26102460Lab9Q4{
	//Method to calculate the final mark
	public static double calcFinalMark(double assignmentMark, double examMark){
		return (assignmentMark * 0.3) + (examMark* 0.7);
	}
	//Method to find grades
	public static char findGrades(double finalMark){
		if(finalMark >= 75){
			return 'A';
		}
		else if(finalMark >= 60){
			return 'B';
		}
		else if(finalMark >= 50){
			return 'C';
		}
		else{
			return 'F';
		}
	}
	//Method to print grades and details
	public static void printDetails(String name, double finalMark, char grade){
		System.out.printf("%s \t\t %.2f \t\t %c\n", name, finalMark, grade);
	}
	
	//Main Method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double assignmentMark, examMark;
		String name[] = new String[5];
		double finalMark[] = new double[5];
		char grade[] = new char[5];
		
		for(int i=0; i < 5; i++){
		
		System.out.println("\nStudent" + (i+1));
		System.out.print("Enter Name: ");
		name[i] = input.nextLine();
		
		System.out.print("Enter Assignment mark: ");
		assignmentMark = input.nextDouble();
		
		System.out.print("Enter Exam mark: ");
		examMark = input.nextDouble();
		input.nextLine();
		
		finalMark[i]= calcFinalMark(assignmentMark, examMark);
		grade[i] = findGrades(finalMark[i]);
		}
		
		//Header
		System.out.println("\nName\t\tFinal Mark\tGrade");
		
		//Printing the details
		for(int i=0; i<5; i++){
			printDetails(name[i], finalMark[i], grade[i]);
		}

	}
}
