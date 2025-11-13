package Array;

public class Duplicatenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 11, 44, 22, 33, 44 };
		System.out.println("Duplicate elements are:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
