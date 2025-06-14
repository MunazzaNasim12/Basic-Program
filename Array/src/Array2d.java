import java.util.Scanner;
public class Array2d {

	public static void main(String[] args) 
	{
		int arr[][]=new int [2][];
		
		arr[0]=new int [3];
		arr[1]=new int [2];
		
		Scanner sc=new Scanner(System.in);;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the number "+ i + "  "+ j);
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println();
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		

	}

}
