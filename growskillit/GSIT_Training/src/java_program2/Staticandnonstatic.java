package java_program2;

import java_program.Nonstaticmethod;

public class Staticandnonstatic {
	
	public static void main(String[] args)
	{
		Nonstaticmethod.m1();
		Nonstaticmethod m = new Nonstaticmethod();
		m.m2();
	}

}
