class Alpha2 {
	int a,b;
	
	Alpha2(){
		a=20;
		b=10;
		System.out.println("Zero parm Contructor in Alpha");
	}
	
	Alpha2(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("param Contructor in Alpha");
	}
}
class Beta2 extends Alpha2{
	int x,y;
	
		Beta2(){
		x=20;
		y=10;
		System.out.println("Zero parm Contructor in Beta");
	}
	
	Beta2(int x, int y){
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

public class Inheritance5 {

	public static void main(String[] args) {
	
		Beta2 b= new Beta2(3,1);
		b.disp();
	}

}
