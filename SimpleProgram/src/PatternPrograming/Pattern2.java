package PatternPrograming;

public class Pattern2 
{
	public static void main(String args[]) {
		
		int n=5;
		for(int i=0;i<n;i++) //row
		{
			for(int j=0;j<n;j++) //col
			{
				if(i==0|| j==0 || i==n-1 || j==n-1) 
				{
				System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

//	j 01234 
//i 0 *****
//	1 *   *
//	2 *   *
//	3 *   *
//	4 *****

//When i(row)value are 0 or n-1 (5-1=4) last row, j(col)value are 0 or n-1 (5-1=4) .


