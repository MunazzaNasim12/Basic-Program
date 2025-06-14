class Plane2 //hiareachical inheritance
{
	void fly() {
		System.out.println("Plane is fly...");
	}
	
	void landing() {
		System.out.println("plane is landing right time...");
	}
	void takeOver() {
		System.out.println("Plane is takeOver...");
	}
}
class FiterPlane2 extends Plane2
{
	void fly() {
		System.out.println("FiterPlane is fly...");
	}
	
	void landing() {
		System.out.println("Fiterplane is landing right time...");
	}
	
	void takeOver() {
		System.out.println("FiterPlane is takeOver...");
	}
}
class CarboPlane2 extends Plane2
{
	void fly() {
		System.out.println("CarboPlane is fly...");
	}
	
	void landing() {
		System.out.println("CarboPlane is landing right time...");
	}
	@Override
	void takeOver() {
		System.out.println("CarboPlane,,, is takeOver...");
	}
}
public class poly2 {
	public static void main (String arg[]) {
		
		CarboPlane2 cp=new CarboPlane2();
		FiterPlane2 fp=new FiterPlane2();
		
		Plane2 p;
	
		p =cp;
		p.fly();
		p.landing();
		p.takeOver();
		
		System.out.println("*********************************");
		p=fp;
		p.fly();
		p.landing();
		p.takeOver();
	}
}
