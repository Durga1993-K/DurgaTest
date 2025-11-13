package Questions;

class Cow {
	void eat() {
		System.out.println("Eating");
	}
}

class StreetDog extends Cow {
	void bark() {
		System.out.println("Barking");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		StreetDog d = new StreetDog();
		d.eat();
		d.bark();
	}
}