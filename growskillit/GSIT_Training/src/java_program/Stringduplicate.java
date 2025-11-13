package java_program;

public class Stringduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="abcdef";
		String b ="xyz1234";
		String c ="abcxy";
		if(a.length()>c.length() && a.length()<b.length())
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}		
		if(a.equals(b) == false && a.equals(c) ==false )
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		if(c.equalsIgnoreCase(c))
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		if(a.contains("cd")==true && a.contains("xy") != true){
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}

		if(b.toUpperCase().contains("Z") == true && b.toUpperCase().contains("z") == false) {
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
		
	}

}
