package Questions;

abstract class Vehicle {
	abstract void start();// abstract method

	void run()// concrete method
	{
		System.out.println("Vehicle is running");
	}
}
	class Car extends Vehicle
	{
		@Override
		void start()
		{
			System.out.println("Car is Running");
		}
	}
	public class Abstraction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new Car();
		obj.start();
		obj.run();
	}
	}


	
