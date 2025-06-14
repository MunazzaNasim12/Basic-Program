class Test2
{
	static int a,b,c;
	int x,y,z;
	
	static {
		a=20;
		b=30;
		c=40;
		System.out.println("Static block...");
	}
	Test2(){
		System.out.println("zero parameter contructer...");
	}
	
	{
		x=1;
		y=2;
		z=3;
		System.out.println(" x : "+x);
		System.out.println(" y : "+ y);
		System.out.println(" z : "+z);
	}
	
}
public class StaticContructer 
{
	public static void main (String args[]) {
		Test2 t=new Test2();
	}
}
