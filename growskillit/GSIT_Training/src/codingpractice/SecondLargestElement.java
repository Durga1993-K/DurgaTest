package codingpractice;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 7, 8, 9, 11, 12, 13 ,20 };
		
//		for (int i = 0; i < arr.length; i++)// 22,33,44,11
//		{
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] < arr[j]) {
//					int temp = arr[i];// arr is blank
//					arr[i] = arr[j];
//					arr[j] = temp;
//					
//				}
//				
//			}
//		}
		
		Arrays.sort(arr);
		System.out.print(arr[arr.length-2]);
	}

}
