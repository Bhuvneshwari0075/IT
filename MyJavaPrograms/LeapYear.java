
public class LeapYear {

	public static void main(String[] args) {
		        int year = 2008 ;
		        System.out.println("Evaluating Leap year");
		      
		        boolean a = (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0); // most clear due to Parenthesis
		        boolean b = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); // less clear expression
		        boolean c = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0; // less clear expression
		        boolean d = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0); // less clear expression
		        boolean e = year % 4 == 0 && year % 100 != 0 || year % 400 == 0; // least clear expression
		        System.out.println(a);
		        System.out.println(b);
		        System.out.println(c);
		        System.out.println(d);
		        System.out.println(e);
		    }
		}
