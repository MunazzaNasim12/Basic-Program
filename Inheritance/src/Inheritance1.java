class A{
	int a;
	int b;
	int sum;
}

class B extends A{
//	a=20;
//	b=30;

	void fun() {
		a=29;
		b=30;
		sum=a+b;
		System.out.println(sum);
	}
}
public class Inheritance1 
{
	public static void main(String arhs[]) 
	{
	B obj=new B();
	obj.fun();
		
	}
}
