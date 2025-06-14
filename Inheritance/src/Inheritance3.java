class AeroPlane
{
	void fly () {
		System.out.println("AeroPlane is fly...");
	}
	
	void landing() {
		System.out.println("langing in AeroPlane...");
	}
}
class CarboPlane extends AeroPlane{
	
	//landing Inheried method
	void fly() {//Override method
		System.out.println("CarboPlane is fly...");
	}
	
	
	void takeOf() {//Specelization method
		System.out.println("TakeOf in CarboPlane...");
	}
}
public class Inheritance3
{
	public static void main(String args[]) {
		
	AeroPlane ap=new CarboPlane();
	
	ap.fly();
	ap.landing();
	((CarboPlane) ap).takeOf();
	
	AeroPlane ap2=new CarboPlane();
	
	ap2.fly();
	ap2.landing();
	( (CarboPlane) ap2).takeOf();
	
	
	}
}
