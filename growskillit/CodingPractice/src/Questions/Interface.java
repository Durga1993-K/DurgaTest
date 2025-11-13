package Questions;


interface Drawable {
	void draw();
	void measurements();
}

class Circle implements Drawable {
	public void draw() {
		System.out.println("Drawing circle");
	}

	public void measurements() {
		System.out.println("Taking measurements");
	}
}

class Interface{ 
	public static void main(String[] args){ 
		Drawable d=new Circle(); 
		d.draw();
		d.measurements();
}
	}