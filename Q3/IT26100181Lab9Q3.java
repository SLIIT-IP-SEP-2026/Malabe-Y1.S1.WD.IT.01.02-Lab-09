public class IT26100181Lab9Q3{
	public static void main(String[] args){
		
		// i.(3 * 4 + 5 * 7)^2...
		// 2 multiplication...
		int mulNum1 = multiple(3,4);
		int mulNum2 = multiple(5,7);
		
		// addition of the mulitpled numbers...
		int addNum = add(mulNum1,mulNum2);
		
		// square of the final number...
		int powerNum = square(addNum,2);
		
		
		
		// ii.(4+7)^2 + (8+3)^2;
		//addition...
		int addNum2 =add(4,7);
		// square...
		int squareNum2 = square(addNum2,2);
		
		//addition2...
		int addNum3 = add(8,3);
		// square...
		int squareNum3 = square(addNum3,2);
		
		// addition of the final numbers...
		int addNum4 = add(squareNum2,squareNum3);
		
		
		//Printing the values...
		System.out.printf("Result of (3*4+5*7)^2 \t        : %3d\n",powerNum);
		
		System.out.printf("Result of (4 +7)^2 + (8+3)^2 \t: %3d",addNum4);
		
	}
	
	//Making the method to add numbers...
	public static int add(int a, int b){
		int addNum = a + b;
		return addNum;
	}
	
	//Making the method to multiply numbers...
	public static int multiple(int a, int b){
		int mulNum = a * b;
		return mulNum;
	}
	
	//Making the method to get the square of a number...
	public static int square(int a, int b){
		int squNum = (int)Math.pow(a,b);
		return squNum;
	}
}
