import java.util.Scanner;

abstract class Pasenger
{
	String name;
	int id;
	String gender;
	abstract int pasengerId();
	abstract String pasengerName();
	abstract String pasengerGender();
	abstract void disp();
}

class Train extends Pasenger{
	int pasengerId() 
	{
		System.out.println("Enter train id...");
		Scanner sc=new Scanner(System.in);
		return id=sc.nextInt();
	}
	String pasengerName() 
	{
		System.out.println("Enter the name...");
		Scanner sc=new Scanner(System.in);
		return name=sc.next();
	}
	
	String pasengerGender()
	{
		System.out.println("Enter the gender... (Male or Female)");
		Scanner sc=new Scanner(System.in);
		gender=sc.next();
		gender.toLowerCase();
		return gender;

	}
	
	void disp() 
	{
		if(gender.equals("male")) 
		{
		System.out.println("Wellcome to train Sir");
		}
		
		else
		{
		System.out.println("Wellcome maam");
		}
		System.out.println("Your Id..."+id);
		System.out.println("Your name is..."+name);
		
		System.out.println("********************");
	}
}

class Bus extends Pasenger{
	
	int pasengerId() 
	{
		System.out.println("Enter Bus id...");
		Scanner sc=new Scanner(System.in);
		return id=sc.nextInt();
	}
	String pasengerName() 
	{
		System.out.println("Enter the name...");
		Scanner sc=new Scanner(System.in);
		return name=sc.next();
	}
	
	String pasengerGender()
	{
		System.out.println("Enter the gender... (Male or Female)");
		Scanner sc=new Scanner(System.in);
		gender=sc.next();
		gender.toLowerCase();
		return gender;

	}
	
	void disp() 
	{
		if(gender.equals("Male")) 
		{
		System.out.println("Wellcome to Bus Sir");
		}
		
		else
		{
		System.out.println("Wellcome to Bus maam");
		}
		System.out.println("Your Id..."+id);
		System.out.println("Your name is..."+name);
		
		System.out.println("********************");

	}
}


class Flight extends Pasenger{
	int pasengerId() 
	{
		System.out.println("Enter the id...");
		Scanner sc=new Scanner(System.in);
		return id=sc.nextInt();
	}
	String pasengerName() 
	{
		System.out.println("Enter the name...");
		Scanner sc=new Scanner(System.in);
		return name=sc.next();
	}
	
	String pasengerGender()
	{
		System.out.println("Enter the gender... (Male or Female)");
		Scanner sc=new Scanner(System.in);
		gender=sc.next();
		gender.toLowerCase();
		return gender;

	}
	
	void disp() 
	{
		if(gender.equals("male")) 
		{
		System.out.println("Wellcome to flight Sir");
		}
		
		else
		{
		System.out.println("Wellcome to flight maam");
		}
		System.out.println("Your Id..."+id);
		System.out.println("Your name is..."+name);
		
		System.out.println("********************");

	}
}

public class TestAbstruct 
{
	public static void main(String args[]) {
		
	Train t=new Train();
	Bus b=new Bus();
	Flight f=new Flight();

	t.pasengerId();
	t.pasengerName();
	t.pasengerGender();
	t.disp();
	
	b.pasengerId();
	b.pasengerName();
	b.pasengerGender();
	b.disp();
	
	f.pasengerId();
	f.pasengerName();
	f.pasengerGender();
	f.disp();

	}
}
