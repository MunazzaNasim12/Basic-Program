class Test{
	private String name;
	private int id;
	
	void setName(String name) {
		this.name=name;
	}
	
	void setId(int id) {
		this.id=id;
	}
	Test(){
		
	}
	Test(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	String getname() {
		return name;
	}
	
	int getid() {
		return id;
	}
	
	public String toString() {
		return "{Name "+name +" id "+id +"}";
		
	}
	
}
public class Lunch1 
{
	public static void main(String ars[]) 
	{
	Test t=new Test("munazza",333);	
	System.out.print(t);
	}
}
