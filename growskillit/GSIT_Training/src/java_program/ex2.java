package java_program;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		try {
			String s= null;
			System.out.println(s.length());

		} catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("rest of code");
		}
	}

}
