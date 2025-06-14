class Alpha3 {
	int a,b;
	
	Alpha3(){
		a=20;
		b=10;
		System.out.println("Zero parm Contructor in Alpha");
	}
	
	Alpha3(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("param Contructor in Alpha");
	}
}
class Beta3 extends Alpha3{
	int x,y;
	
		Beta3(){
		x=20;
		y=10;
		System.out.println("Zero parm Contructor in Beta");
	}
	
	Beta3(int x, int y){
		super(4,5);
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

public class Inheritance6 {
	public static void main(String args[]) {
		
		Beta3 b= new Beta3(1,2);
		b.disp();
	}
}
