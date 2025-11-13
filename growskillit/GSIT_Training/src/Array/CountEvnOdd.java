package Array;

public class CountEvnOdd {
	public static void main(String[] args) {

		int[] arr = { 34, 55, 43, 54, 67, 89 };

		int evn = 0;
		int odd = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is an Even Number");
				evn++;
			} else {
				System.out.println(arr[i] + " is an Odd Number");
				odd++;
			}

		}
		System.out.println("Total Even Numbers: " + evn);
		System.out.println("Total Odd Numbers: " + odd);
	}

}
