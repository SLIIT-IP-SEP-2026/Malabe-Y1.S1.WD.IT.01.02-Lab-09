import java.util.Scanner;
public class IT26102362Lab9Q4{
	
	public static double calFinalMark(double asignment, double exam){
		double finalMark = (asignment*30/100) + (exam*70/100);
		return finalMark;
	}
	
	public static char findGrade(double finalMark){
		char grade;
		if (finalMark >= 75){
			grade = 'A';
			return grade;
		}
		else if(finalMark >= 60){
			grade = 'B';
			return grade;
		}
		else if(finalMark >= 50){
			grade = 'C';
			return grade;
		}
		else{
			grade = 'F';
			return grade;
		}
	}
	
	public static void printDetils(String name[],double asignment[],double examPaperMark[] ){
		System.out.println("\nName\t\tFinal Mark\tGrade");
		for(int i = 0; i < name.length; i++){
			double finalMark = calFinalMark(asignment[i], examPaperMark[i]);
			char grade = findGrade(finalMark);
        
			System.out.println(name[i] + "\t\t" + finalMark + "\t\t" + grade);
		}
	}
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String name[] = new String[5];
		double assignment[] = new double[5];
		double examPaperMark[] = new double[5];
		double assignmentMarks, examMark;
		
		for(int i=0; i<5; i++){
			System.out.print("Enter Name of Student "+(i+1)+": ");
			name[i] = input.next();
			
			System.out.print("Enter Assignment Mark (out of 100) for "+name[i]+": ");
			while(true){
				assignmentMarks = input.nextDouble();
				if(assignmentMarks>=0 && assignmentMarks<=100){
					assignment[i] = assignmentMarks;
					break;
				}
				else{
					System.out.print("Enter a valid mark: ");
				}
			}
			System.out.print("Enter Exam Paper Mark (out of 100) for "+name[i]+": ");
			while(true){
				examMark = input.nextDouble();
				if(examMark>=0 && examMark<=100){
					examPaperMark[i] = examMark;
					break;
				}
				else{
					System.out.print("Enter a valid mark: ");
				}
			}
			System.out.println();
		}
		printDetils(name, assignment, examPaperMark);
	}
}