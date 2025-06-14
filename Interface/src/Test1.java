interface demo{
	void show();
	static void disp() {
		System.out.println("interface static show method");
	}
	
	default void greating() 
	{
	System.out.println("welcome....");	
	}
}
class demo2 implements demo{
	public void show() {
		System.out.println("Focus is a key....");
	}
}

public class Test1 
{
	public static void main(String argd[]) {
		
		demo d=new demo2();
		
//		d.disp();This static method of interface demo can only be accessed as demo.disp
		demo.disp();//this method of interface demo can only be acccessed as demo.disp
		
//		demo.greating();Cannot make a static reference to the non-static method greating() from the type demo
		d.greating();
		
		d.show();
	}
}
