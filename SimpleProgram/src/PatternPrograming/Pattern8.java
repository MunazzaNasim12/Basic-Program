package PatternPrograming;

public class Pattern8 
{
	public static void main(String arhs[]) 
	{
		int n=10;
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0&&j<n-1) ||(i==(n-1)/2 &&j<n-1 )|| (i==n-1 && j<n-1) ||
						(j==n-1 && i>0 &&i<n-1 && i!=(n-1)/2)) 
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


//O/P
//		********* 
//		*        *
//		*        *
//		*        *
//		********* 
//		*        *
//		*        *
//		*        *
//		*        *
//		********* 
