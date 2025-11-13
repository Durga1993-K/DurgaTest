package java_program;

public class Parent {
	public void lands() {
		System.out.println("lands");
	}
}

class Child extends Parent {
		
		public void gold() {
			System.out.println("gold");
		}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.lands();
		obj.gold();
	}
}

	
