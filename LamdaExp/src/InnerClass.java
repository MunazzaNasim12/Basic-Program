class Person{
	class PersonDetail {
		void Name() {
			System.out.println("Rohan...");
		}
	}
}

public class InnerClass {
	public static void main(String args[]) {
		
		Person p=new Person();
		Person.PersonDetail p2=p.new PersonDetail();
		p2.Name();
	}
}
