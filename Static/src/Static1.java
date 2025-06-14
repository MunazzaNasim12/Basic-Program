class Test{
	static int a , b, c;
	
	static{
//		Static block 
		a=10;
		b=20;
		c=30;
		System.out.println("Static block");
	}
	
	{
		//java inti block...
		System.out.println("java block");
	}
	
	static void disp()
	{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
	
}
public class Static1 
{
	public static void main(String args[]) 
	{
	Test.disp();
//	Test t=new Test();	
//	t.disp();
//	t.disp();
	}
}
