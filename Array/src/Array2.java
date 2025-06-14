import java.util.Scanner;

public class Array2 
{
	public static void main(String args[]) {
		
		int arr[][]=new int [2][2];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("place inter the marks of "+i +" Student.."+j);
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				///System.out.println("place inter the marks of student.."+arr[i][j]);
				System.out.print(arr[i][j]+" ");
				
			}
		}

	}
}
