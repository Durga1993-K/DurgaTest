package codingpractice;

public class SumUsing {

	public static void m1(int sum) {
		
		int[] arr = { 4, 5, 7, 8, 9, 11, 12, 13 };
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] + arr[j] == sum) {
					
					System.out.println("(" + arr[i] + " " + arr[j] + ")");
					
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(17);
	}

}
