
import java.util.Scanner;
public class DecimalToBinary{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int result=0,i=0;
		 int bin[]=new int[10] ;
		while(num>0){
			
			result=num%2;
			bin[i]=result;
			
			num=num/2;
			i++;
	
			
		}
		for(int a1=i-1;a1>=0;a1--) {
		System.out.print(bin[a1]);
		
		}
		scan.close();
	
	}
	}
