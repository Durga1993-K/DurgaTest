package Questions;

class Stundent {
	int id;
	String name;

	Stundent(int i) {
		id = i;
	}

	Stundent(String n) {
		name = n;
	}

	public static void main(String[] args) {
		Stundent s1 = new Stundent(10);
		Stundent s2 = new Stundent("John");
		System.out.println(s1.id);
		System.out.println(s2.name);
	
}
}

