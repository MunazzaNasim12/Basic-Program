class Student{
	int name;
	int age;
	int add;
	
	void playing() {
		System.out.println("Student is playing...");
	}
	
	void Studing() {
		System.out.println("Student is playing...");
	}
}
public class Opp1 {

	public static void main(String[] args) 
	{
		
	Student st = new Student();
	st.Studing();
	st.playing();
	}

}
