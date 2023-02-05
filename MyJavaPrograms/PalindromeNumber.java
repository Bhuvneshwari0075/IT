//Program to check if the entered number is a paindrome or not.(reversing the no.)

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number,reverseNumber=0,number1=0;
		System.out.println("Enter the number to check if it is palindrome");
        Scanner scan=new Scanner(System.in);
        number=scan.nextInt();
        number1=number;
        while(number!=0)
        {reverseNumber=(reverseNumber*10)+number%10;
        number=number/10;}
        
        if(reverseNumber==number1)
        System.out.println("The number "+ number1 +" is a palindrome");
       else
        System.out.println("The number "+ number1 + " is a not palindrome");
        
        scan.close();

	}

}
