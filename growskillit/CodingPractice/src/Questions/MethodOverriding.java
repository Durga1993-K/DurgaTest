package Questions;

		// TODO Auto-generated method stub
		class Animal {
		    void sound() {
		        System.out.println("Animal makes a sound");
		    }
		}

		class Dog extends Animal {
		   
		    void sound() {
		    	super.sound();
		        System.out.println("Dog barks");
		    }
		}
		
		class Cat extends Dog{
			  
			    void sound() {
				   super.sound();
			        System.out.println("Cat Meows");
			    }
		}

		public class MethodOverriding {
		    public static void main(String[] args) {
		        Animal obj = new Cat();  // parent reference, child object
		        obj.sound();             // which sound() will run?
		    }
		}
	


