import java.util.Scanner;
public class IT26102061Lab9Q4{
	
	//  Method 1
	
	public static double calcFinalMark(double a,double e){
		return (a*30/100)+(e*70/100);
	}
	
	//  Method 2
	
	public static char findGrades(double mark){
		
		char grade;
		
		if(mark>=75){
			grade='A';
		}
		else if(mark<75 && mark>=60){
			grade='B';
		}
		else if(mark<60 && mark>=50){
			grade='C';
		}
		else{
			grade='F';
		}
		
		return grade;
	}
	
	//  Method 3
	
	public static void printDetails(String name[],double f[],double e[]){
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]+"           "+calcFinalMark(f[i],e[i])+"                "+findGrades(calcFinalMark(f[i],e[i])));
		}
	}
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		String name[]=new String[5];
		double assignment[]=new double[5];
		double exam[]=new double[5];
		int num=1;
		
		for(int i=0;i<name.length;i++){
			while(true){
				System.out.print("\nEnter Name of Student "+num+" : ");
				name[i]=input.next();
				
				while(true){
					System.out.print("Enter Assignment Mark (out of 100) for "+name[i]+" : ");
					assignment[i]=input.nextDouble();
					if(assignment[i]>=0 && assignment[i]<=100){
						assignment[i]=assignment[i];
						
						while(true){
							System.out.print("Enter Exam Paper Mark (out of 100) for "+name[i]+" : ");
							exam[i]=input.nextDouble();
							if(exam[i]>=0 && exam[i]<=100){
								exam[i]=exam[i];
								num++;
								break;
							}
							else{
								System.out.println("\n --- Enter valid Assignment Mark --- \n");
							}
						}
						break;
					}
					else{
						System.out.println("\n --- Enter valid Assignment Mark --- \n");
					}
				}
				break;
			}
		}
		
		// Print Table 
		
		System.out.println("Name          Final Mark       Grade  ");
		printDetails(name,assignment,exam);
		
	}
}
				
	
				
		
		