
public class Static3 
{
	static int a;
	
	static {
		a=10;
		System.out.println("a : "+a);
		System.out.println("Static block...");
				
	}
	
	public static void main(String args[]) 
	{
		System.out.println("main block...");
	}
}
