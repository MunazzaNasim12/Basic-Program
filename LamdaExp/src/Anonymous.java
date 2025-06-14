class A{
	void show() {
		System.out.println("In class A in Show");
	}
}
public class Anonymous {

	public static void main(String[] args) 
	{
		A a=new A() {
			void show() {
				System.out.print("In new Show....");
			}
		};a.show();
	}

}
