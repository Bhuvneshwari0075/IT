
public class ButterflyPattern {
public static void main(String[]args) {
for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}
		for(int j=i;j<=4;j++) {
			System.out.print("  ");
			
	}
		for(int j=i;j<=4;j++){
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}

	for(int a=1;a<=5;a++) {
		for(int j=a;j<=4;j++) {
			System.out.print(" *");
		}
		for(int j=1;j<=a;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=a;j++) {
			System.out.print("  ");
		}
		for(int j=a;j<=4;j++) {
			System.out.print(" *");
		}
		
		
		
		System.out.println();
}
}
}
