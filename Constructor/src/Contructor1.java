//Contructor overloding...
class Emp{
	int id;
	String name;
	String city;
	
	Emp(){
		super();
		System.out.println("Zero parameter contructor...");	
	}
	
	
	Emp(int id,String name,String city){
		this.name=name;
		this.id=id;
		this.city=city;
		System.out.println("2 parameters contructor...");
	}
	
	
}

public class Contructor1 {

	public static void main(String[] args) 
	{

		Emp emp=new Emp(22,"Rohan","Mumbai");
		
		System.out.println("********************************************");
		
		Emp emp2 =new Emp();

	}

}
