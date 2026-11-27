public class IT26102649Lab9Q3{

	//Method1
	public static int add(int i1, int i2){
		return i1+i2;
	}
	//Method2
	public static int multiply(int i1, int i2){
		return i1*i2;
	}
	//Method3
	public static int square(int i1){
		return i1*i1;
	}
	public static void main(String[] args){
	//(3*4+5*7)^2
	int exp1 = square(add(multiply(3,4),multiply(5,7)));
	
	//(4+7)^2+(8+3)^2
	int exp2 = add(square(add(4,7)),square(add(8,3)));
	
	System.out.println("Result of (3*4+5*7)^2   :" + exp1);
	System.out.println("Result of (4+7)^2+(8+3)^2   :" + exp2);
	}
}