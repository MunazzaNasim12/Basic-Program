class Test2{
	protected int a=7;
	
	private void disp() {
		System.out.println("This is protected method in A class");
	}
}

class Test3 extends Test2
{
	
	public void disp() {
		System.out.println("This is public method in B class ");
		System.out.println(super.getClass());
		System.out.println(super.a);
	}
}
public class Inheritance8 
{
	public static void main(String args[]) {
	new Test3().disp();
	}
}
