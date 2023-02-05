
public class ReverseHillPattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int r=1;r<i;r++)
			{System.out.print("  ");
			
			}
			for(int r=i;r<n;r++)
            {System.out.print("* ");
			
			}
			for(int r=i;r<=n;r++)
            {System.out.print("* ");
			
			}
			System.out.println();
		}
		

	}

}
