
public class ArmstrongNumber {
//To check whether the given number is Armstrong number or not.
// eg. 371=3*3*3+7*7*7+1*1*1 ... 
//we are multiplying 3 times as it has 3 digits	
	public static void main(String[] args) {
		int number=1371;
		int result=0;
		 int number2=1;
		 int originalNumber=1371;
		while(number!=0)
		{int number1=number%10;
		
		 for(int i=1;i<=3;i++)
		 {
		   number2=number2*number1;
				 }
		 result=result+number2;
		 number=number/10;
		 number2=1;
		}
		System.out.println(result);
if(result==originalNumber)
	System.out.println("this is an Armstrong number");
else
	System.out.println("this is  not an Armstrong number");
	
	}

}
