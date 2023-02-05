
public class BitwiseXorOperator {

	public static void main(String[] args) {
		int  num1=11;
		int num2=22;
		int result;
		result=num1^num2;
		System.out.println("Value of first number num1 is:" +num1);
		System.out.println("Value of second number num2 is:" +num2);
		num1=num1^result;
		System.out.println("Value of first number num1 becomes:" +num1);
		
		num2=num2^result;
		System.out.println("Value of second number num2 becomes :" +num2);
	}

}
