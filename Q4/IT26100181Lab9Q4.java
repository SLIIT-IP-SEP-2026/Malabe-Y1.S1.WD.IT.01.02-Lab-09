import java.util.Scanner;
public class IT26100181Lab9Q4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Making an array to get Names...
		String[] nameArray = new String[5];
		
		// Making an array to get Assignment marks...
		int[] assignmentArray = new int[5];
		
		// Making an array to get Exam paper marks...
		int[] examArray = new int[5];
		
		// Making an array to get the final marks...
		double[] finalMarksArray = new double[5];
		
		// Making an array to get the result...
		String[] resultArray = new String[5];
		
		
		// Getting inputs...
		for(int i = 0; i < nameArray.length; i++){
			System.out.printf("Enter name of student %d: ",i+1);
			nameArray[i] = input.nextLine();
			
			System.out.printf("Enter assignment mark (out of 100) for %s: ",nameArray[i]);
			assignmentArray[i] = input.nextInt();
			
			System.out.printf("Enter exam paper mark (out of 100) for %s: ",nameArray[i]);
			examArray[i] = input.nextInt();
			input.nextLine();
			
			System.out.println();
		}
		
		// Getting inputs to final...
		for(int i = 0; i < finalMarksArray.length; i++){
			finalMarksArray[i] = calcFinalMark(assignmentArray[i],examArray[i]);
		}
		
		// Getting resuts to resutl Array...
		for(int i = 0; i < resultArray.length; i++){
			resultArray[i] = findGrade(finalMarksArray[i]);
		}
		
		// Printing the name,finalmarks & grade by using print method...
		printDetails(nameArray,finalMarksArray,resultArray);
	}
	
	// Making a method to get the final marks...
	public static double calcFinalMark(int assignmentMarks,int examMark){
		double assignmentPercentageMark = (30/100.0) * assignmentMarks;
		double examPercentageMark = (70/100.0) * examMark;
		
		double finalMarks = assignmentPercentageMark + examPercentageMark;
		return finalMarks;
	}
	
	// Making a method to find grages...
	public static String findGrade(double finalMarks){
		String result = "";
		
		if (finalMarks >= 75){
			result = "A";
		}else if(60 <= finalMarks && finalMarks < 75){
			result = "B";
		}else if(50 <= finalMarks && finalMarks < 60){
			result = "C";
		}else{
			result = "F";
		}
		
		return result;
	}
	
	// Making a method to printDetails...
	public static void printDetails(String[] nameArray, double[] finalMarksArray,String[] resultArray){
		System.out.printf("%-14s%-14s%-14s\n","Name","Final Marks","Grade");
		for(int i = 0; i < 5; i++){
			System.out.printf("%-14s%-14.2f%-14s\n",nameArray[i],finalMarksArray[i],resultArray[i]);
		}	
	}
}
