//this keyword:- ref to the current obj
class Add
{
	int num1;
	int num2;
	
	Add(){
		System.out.println("Zero parameter contructor");
	}
	
	Add(int num1)
	{
		this();
		System.out.println("1 parameter contructor");
	}
	
	Add(int num1,int num2)
	{
		this();
		System.out.println("2 parameter contructor");
	}
}

public class Contructor2 
{
	public static void main(String args[]) 
	{
	Add obj=new Add(2,3);
	
	}
}
