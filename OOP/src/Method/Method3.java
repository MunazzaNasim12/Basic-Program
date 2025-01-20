package Method;

class Test3 {
	int num1;
	int num2;
	int res;
	
//	Method with return-type or no-parameter...
	int add()
	{
		num1=20;
		num2=30;
		res=num1+num2;
//		System.out.println(res);
		return res;
	}
	
}
public class Method3 
{
	public static void main(String args[]) {
	
		Test3 M=new Test3();
		int res=M.add();
		System.out.println(res);
	}
}
