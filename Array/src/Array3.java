import java.util.Scanner;

public class Array3 {

	public static void main(String arggs[]) {
		
		int arr[][][]=new int [2][][];
		
			arr[0]=new int [2][];
			arr[1]=new int [3][];
			
			arr[0][0]=new int [2];
			arr[0][1]=new int [4];
			
			arr[1][0]=new int [2];
			arr[1][1]=new int [3];
			arr[1][2]=new int [2];
			
			Scanner sc=new Scanner(System.in);
	
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) 
				{
					for(int k=0;k<arr[i][j].length;k++) 
					{
						System.out.println("Enter the number...."+ i +" "+j + " "+k);
						arr[i][j][k]=sc.nextInt();
						System.out.println(arr[i][j][k]+" ");
					}
				}
			}
			
			for(int i=0;i<arr.length;i++) 
			{
				for(int j=0;j<arr[i].length;j++) 
				{
					for(int k=0;k<arr[i][j].length;k++) 
					{
						
						System.out.print(arr[i][j][k]+" ");
					}
					System.out.println();
				}
			}
	}
}
