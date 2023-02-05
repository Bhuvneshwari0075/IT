import java.util.Scanner;

public class LeapYear1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int year;
		System.out.println("Enter a year:");
		year=scan.nextInt();
		scan.close();
		
		if(year%4==0 && year%100!=0 )
			System.out.println("This is a leap year");
		else if(year%400==0)
			
		    System.out.println("This is a leap year");
			
			else
				System.out.println("This is  not a leap year");

	}

}
