package java_program;

public class ExceptionHandling {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			int data = 100 /0;
			System.out.println(data);

		} catch (Exception e) {
			System.out.println("This is not divided by 0");
		}
		
		System.out.println("Bhavi Tej");
	}
}
