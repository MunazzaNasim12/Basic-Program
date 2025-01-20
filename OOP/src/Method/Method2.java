package Method;
class Test2 {
	int num1;
	int num2;
	int res;
	
//	Method no return type with parameter...
	void add(int n1,int n2)
	{
	num1=n1;
	num2=n2;
	res=num1+num2;
	System.out.println(res);
	}
	
}
public class Method2 
{
	public static void main(String args[]) {
		Test2 m=new Test2();
		m.add(20, 30);
		System.out.print(Test2.class);
}
}
