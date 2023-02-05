
public class PatternRightTriangle {

	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=num;i++)
		{
			for(int left=1;left<i;left++)
			{
			System.out.print("  ");//when left=1,,kt will skip the for loop.
		    }
			for(int right=i;right<=num;right++)
			{
			System.out.print("* ");
		    }
			System.out.println();
		}
			

	}

}
