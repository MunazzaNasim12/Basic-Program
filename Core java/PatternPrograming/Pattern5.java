package PatternPrograming;


public class Pattern5 
{
	public static void main(String ars[]) 
	{
		int n=10;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(j==0|| i==0 || i==n-1 || i==(n-1)/2) 
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

//		o/p
//		**********
//		*         
//		*         
//		*         
//		**********
//		*         
//		*         
//		*         
//		*         
//		**********
