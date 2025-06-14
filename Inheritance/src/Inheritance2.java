class Test{
	
	int sum;
	Test(){
		System.out.println("zero parameter Contructer...");
	}
	
	int fun(int a,int b) {
		sum=a+b;
		System.out.println(sum +" in test");
		return sum;
	}
}

class Test1 extends Test{
	{
	System.out.println(sum + " in Test1");
	}
}

public class Inheritance2 
{
	public static void main(String args[]) {
		Test1 t=new Test1();
		t.fun(30, 3);
	}
}
