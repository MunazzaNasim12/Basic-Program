class Parent
{
	int i=10;
	
	void disp() {
		System.out.println(i);
	}

}
class Child extends Parent{
	int i=100;
	
	@Override
	void disp() {
		super.disp();
		System.out.println(i);
		System.out.println(super.i);
	}
}
public class Inheritance7 {

	public static void main(String[] args) 
	{
		
		new Child().disp();
	}

}
