package BasicProgram;

public class Loop 
{
	public static void main(String args[]) 
	{
//		Same proram diff Loop....
		
//		Using for Loop
		for(int k=1;k<5;k++) {
			System.out.println("*");
		}

//		Using while loop 
		int i=1;
		while(i<5) {
			System.out.println("*");
			i++;
		}

//		Using Do while Loop But diff is when condition is false; the execute code one time
		int j=1;
		do { 
			System.out.println("******");
			j++;
		}while(j<5);
	}
}
