class Plane //hiareachical inheritance
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
class FiterPlane extends Plane
{
	@Override
//	void fly() {
//		System.out.println("FiterPlane is fly...");
//	}
	
	void landing() {
		System.out.println("Fiterplane is landing right time...");
	}
	
	void Wait() {
		System.out.println("Waiting.......!");
	}
	
}
class CarboPlane extends Plane
{
	@Override
	void fly() {
		System.out.println("CarboPlane is fly...");
	}
	
	void landing() {
		System.out.println("CarboPlane is landing right time...");
	}
	
}
public class poly1 {
		
	public static void main(String args[]) {
		Plane fp=new FiterPlane();
		
		Plane cp=new CarboPlane();
		
		fp.fly();
		fp.landing();
		fp.takeOver();
		//fp.wait();
		
		((FiterPlane)fp).Wait();	
//		( (CarboPlane) ap2).takeOf();
		
		
		
	}
}
