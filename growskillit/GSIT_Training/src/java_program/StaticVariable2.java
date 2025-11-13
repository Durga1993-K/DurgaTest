package java_program;

public class StaticVariable2 {
	
	public static int a = 5;
	static int b = 10;
	
	public static void main(String[] args)
		{
	System.out.println(a+b);
	NonstaticVariable a1 = new NonstaticVariable();
	System.out.println(a1.b + a1.d);
		}

}
