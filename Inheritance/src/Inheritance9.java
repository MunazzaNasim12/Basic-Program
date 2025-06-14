class Plane{
	public Plane Fly () 
	{
		System.out.println("plane is fly");
		return null;
		
	}
}

class Fiterplane{
	public Fiterplane Fly() 
	{
		System.out.println("Fiter plane is fly...");
		Fiterplane f =new Fiterplane();
		return f;
		
	}
}
public class Inheritance9 {

	public static void main(String[] args) 
	{
	
		Fiterplane f=new Fiterplane();
		f.Fly();
	}

}
