package java_program;

public class Nonstaticmethod {

	 public static void m1()
	 {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	 }
	 
	 public void m2() 
	 {
			int c = 10;
			int d = 25;
			System.out.println(c*d);
	 }
	 public static void main (String[] args) 
	 {
		 m1();
		 Nonstaticmethod m = new Nonstaticmethod();
		 m.m2();	
		
	 }

}
