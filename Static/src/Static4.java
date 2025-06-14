import java.util.Scanner;

class Farmer
{
	String name;
	double si;

	float p,t;

	static double r;
	
	
	static {
		r=2.5f;
	}
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name...");
		name=sc.nextLine();
		System.out.println("Kindly Enter the loan amount ");
		p=sc.nextFloat();
		System.out.println("Kindly enter the duration ");
		t=sc.nextFloat();
	}
	
	void calulate() {
		si=(p*t*r)/100.0f;
	
	}
	void disp(){
		System.out.println("Hello "+ name  +" Your SI is amount... "+ si);
	}
}

public class Static4 
{
	public static void main(String args[]) 
	{
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		Farmer f3=new Farmer();
		
		f1.input();
		f1.calulate();
		f1.disp();
		
		f2.input();
		f2.calulate();
		f2.disp();
		
		f3.input();
		f3.calulate();
		f3.disp();
	}
}
