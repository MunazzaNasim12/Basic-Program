class Test{
	String Name;
	int id;
	String address;
}

public class Array5 {

	public static void main(String[] args) 
	{
	Test t[]=new Test[3];
	
	t[0]=new Test();
	t[1]=new Test();
	t[2]=new Test();

	t[0].id=33;
	t[0].Name="Munazza";
	t[0].address="Maharashera...";
	System.out.println(t[0].id);
	System.out.println(t[0].Name);
	System.out.println(t[0].address);
	
	System.out.println(t);
	}

}
