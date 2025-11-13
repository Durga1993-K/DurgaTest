package Questions;

public class Sortfirstfour {
	public static void main(String[] args) {

		int[] arr = { 22, 4, 5, 33, 6, 7, 89, 76 };

		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4
					; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted Array is : ");
		
		for (int data : arr)
		{
			System.out.print(data + " ");
		}
	}
}
