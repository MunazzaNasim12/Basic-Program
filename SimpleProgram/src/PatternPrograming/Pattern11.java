package PatternPrograming;

public class Pattern11 
{
	public static void main(String args[]) 
	{
		int n=8;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==j ||i+j==n-1 ||j==0 ||j==n-1) 
			{
				System.out.print("*");
			}else
				System.out.print(" ");
		}
		System.out.println();;
		
	}	
	}
	
}
//O/P
//		*      *
//		**    **
//		* *  * *
//		*  **  *
//		*  **  *
//		* *  * *
//		**    **
//		*      *
