//how many student in class through in obj...
class Student{
	int id;
	String name;
	String city;
	static int count;
	
	Student(int id,String name,String city){
		this.id=id;
		this.name=name;
		this.city=city;
		
	}
	{
		count++;
	}
}
public class StaticContructer2 
{
	public static void main(String args[]) {
		
		Student s =new Student(101, "Rohan", "Mumbai");
		System.out.println(Student.count);
		
		
		Student s1 =new Student(102, "Rani", "washsim");
		System.out.println(Student.count);

		Student s2 =new Student(103, "Sime", "washsim");
		System.out.println(Student.count);
	}
}
