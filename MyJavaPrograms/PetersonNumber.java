
//Program to check if the entered number is Peterson number.
import java.util.Scanner;

public class PetersonNumber {
	public static void main(String[] args) {
		int number,number1=0,fact=1,result=0,number2=0;
		System.out.println("Enter the number to be checked:");
		Scanner scan= new Scanner(System.in);
		number=scan.nextInt();
		scan.close();
		number2=number;
		 for(;number!=0;)
		 {number1=number%10;
			for(int i=1;i<=number1;i++)
				{fact=fact*i;
				}
			result=result+fact;
			fact=1;
			number=number/10;
						
		 }		
		 
		 if(number2 == result)
			System.out.println("Result is "+ result+" so "+ number2 +" is a Peterson number." );
		 else
			 System.out.println("Result is " + result+" so "+ number2+" is not a Peterson number." );
		 
		}
		
		
		

	}


