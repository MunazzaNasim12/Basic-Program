
public class String1 
{
	public static void main(String arg[]) {
		
//		String str="Java";
//		String str2="Java";
//		
//		System.out.println(str==str2);//true
		
		String str=new String("Java");
		String str2=new String ("Java");
		
		System.out.println(str==str2);//false
		System.out.println(str.equals(str2));//true
		
		str.concat(str2);
		System.out.println(str);
		
		
		String str3=str+str2;
		System.out.println(str3);
	}
}
