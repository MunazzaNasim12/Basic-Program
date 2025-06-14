public class Array4 
{
	public static void main(String args[]) {
	
		int arr[]=new int [4];
		
		arr[0]=22;
		arr[1]=44;
		arr[2]=55;
		arr[3]=66;
		
		for(int row:arr) {
			System.out.print("{"+row + "}");
		}
		
		int a[][]={{4,33,55},{33,55,44}};
		
		for(int row[]:a) {
			for(int elm:row) {
				System.out.print(elm+ " ");
			}
			System.out.println("");
		}
	}
}
