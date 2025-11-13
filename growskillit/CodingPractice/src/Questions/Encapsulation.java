package Questions;

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Person s = new Person();
		s.setName("John");
		System.out.println("Name=" + s.getName());
	}
}



