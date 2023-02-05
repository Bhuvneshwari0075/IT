import java.util.Scanner;
public class CalculatePercentge {

	public static void main(String[] args) {
		float english,hindi,maths,science,socialScience;
		float total=0,MaxMarks=0,average=0,percentage=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks in Hindi:");
		hindi=scan.nextFloat();
		System.out.println("Enter marks in English:");
		english=scan.nextFloat();
		System.out.println("Enter marks in Maths:");
		maths=scan.nextFloat();
		System.out.println("Enter marks in Science");
		science=scan.nextFloat();
		System.out.println("Enter marks in Social Science");
		socialScience=scan.nextFloat();
		total=hindi+english+maths+science+socialScience;
		System.out.println("Enter maximum marks of each subject:");
		MaxMarks=scan.nextFloat();
		average=(total)/(MaxMarks*5);
		percentage=average*100;
		scan.close();
		System.out.println("your percentage in these exams is: "+percentage);
		
	
		

	}

}
