
public class LeapYear3 {

	public static void main(String[] args) {
		
		int year=2009;
		if ( year % 4 == 0) {
			System.out.format("\n %d is a Leap Year. \n", year);
		}
		else if (year%100 == 0) {
			System.out.format("\n %d is NOT a Leap Year. \n", year);
		}
		else if(year%400 == 0) {
			System.out.format("\n %d is a Leap Year. \n", year);
		}
		else {
			System.out.format("\n %d is NOT a Leap Year. \n", year);
		}
	
	}}
