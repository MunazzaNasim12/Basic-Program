package Method;
class Test1
{	
	int num1;
	int num2;
	int res;
	
//	Method no return type or no parameter...
	void add(){
		num1=2;
		num2=3;
		res=num1+num2;
		System.out.println("num1 + num2 = "+res);
	}
}

public class Method1 {

	public static void main(String[] args) 
	{
		Test1 c=new Test1();
		c.add();

	}
}
