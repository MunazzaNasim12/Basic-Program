interface D{
	void show();
}
public class Anonymous1 {

	public static void main(String[] args) 
	{
	D d=()->System.out.println("Hello");	
			
	d.show();
	}

}
