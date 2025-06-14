import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) 
	{
		int a[]=new int[2];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the markes "+i);
			a[i]=sc.nextInt();
		}
		System.out.println("**********************Array***************");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		//
	}

}
