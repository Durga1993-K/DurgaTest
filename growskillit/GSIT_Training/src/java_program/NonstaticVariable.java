package java_program;

public class NonstaticVariable {
	
	public int a =100;
	public int b= 150;
	private int c =150;
	protected int d = 200;
	
	public static void main (String[] args)
	{
		NonstaticVariable a1 = new NonstaticVariable();
		System.out.println(a1.a + a1.b);
		System.out.println(a1.c + a1.b);
		
	}

}
