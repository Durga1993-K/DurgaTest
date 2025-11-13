package Array;

public class SumOfRemainingEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 7, 9, 11 };

		int sum = 0;

		for (int data : arr)

			
		{
			sum = sum + data;

		}
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(sum - arr[i] + " ");
		}

	}

}
