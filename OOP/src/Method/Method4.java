package Method;

class Test4 {
	int num1;
	int num2;
	int res;
	
//	Method with return-type or no-parameter...
	int add(int n1,int n2)
	{
		num1 =n1;
		num2=n2;
		res=num1+num2;
		return res;
	}
	
}
public class Method4 {

	public static void main(String[] args) 
	{
		Test4 t=new Test4();
		int res=t.add(40, 6);
		System.out.print(res);
	}

}
