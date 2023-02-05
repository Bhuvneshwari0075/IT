
public class PyramidPattern {

	public static void main(String[] args) {
			int  n=7;
			
			for(int r=1;r<=n;r++)
			{
				for(int l=r;l<n;l++)
				{
					System.out.print("  ");
				}
				for(int m=1;m<r;m++)
				{ System.out.print("* ");
					
				}
				for(int r1=1;r1<=r;r1++)
				{System.out.print("* ");
				}
								
				System.out.println();
			}
					
	}

}
