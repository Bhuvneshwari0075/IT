
public class DiamondPattern {

	public static void main(String[] args) {
		int  n=5,n1=5; 
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{ System.out.print("* ");
				
			}
			for(int j=1;j<=i;j++)
			{System.out.print("* ");
			}
			System.out.println();
		}
		
		//inverted  ill
			for(int i=1;i<=n1;i++)
			{	
			
				for(int j=1;j<i+1;j++)
			    {System.out.print("  ");	
			     } 
			    for(int j=i+1;j<n1;j++)
			    {System.out.print("* ");	
			    }
			   for(int j=i+1;j<=n1;j++)
			    {System.out.print("* ");	
			      }
			    
			   System.out.println();
		
}	

	} 

}
