class Alpha {
	int a,b;
	
	Alpha(){
		a=20;
		b=10;
		System.out.println("Zero parm Contructor in Alpha");
	}
	
	Alpha(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("param Contructor in Alpha");
	}
}
class Beta extends Alpha{
	int x,y;
	
		Beta(){
		x=20;
		y=10;
		System.out.println("Zero parm Contructor in Beta");
	}
	
	Beta(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println("param Contructor in Beta");
	}
	
	void disp() {
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		System.out.println("x : "+ x);	
		System.out.println("y : "+ y);
	}
}
public class Inheritance4 
{
	public static void main(String arg[]) 
	{
		Beta b= new Beta();
		b.disp();
		
	}
}
