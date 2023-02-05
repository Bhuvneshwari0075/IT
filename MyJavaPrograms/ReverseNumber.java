
public class ReverseNumber {

	public static void main(String[] args) {
		int num=4723,result=0;
		System.out.println("Our original number is:"+num);
		for(int i=0;i<=3;i++)
		{ result=(result*10)+num%10;
		 num=num/10;
		}
		System.out.println("the resulting reversed number is:"+ result);

	}

}
