class calu{
	//a,b are instant variable...
	int a;
	int b;

	void add(){
		a=30;
		b=20;
		int res=a+b; //res is local variable...
	}
	
	void sub() {
		int res=a-b;
		System.out.println(res);
	}
	void mul() {
		int res=a*b;
		System.out.println(res);
	}
		
	void div() {
		int res=a/b;
		System.out.println(res);
	}
}

public class Opp2 
{
	public static void main(String args[]) 
	{
	calu c=new calu();
	c.add();
	c.sub();
	c.mul();
	c.div();
	}
}
