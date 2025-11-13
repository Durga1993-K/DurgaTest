package Array;

import java.util.Scanner;

public class NumisPrsnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 34, 55, 43, 54, 67, 89 };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Element");
		
		int ele = sc.nextInt();
		
		int temp = 0;
		
		for (int data : arr) {
			// System.out.print(data + " ");
			if (ele == data) {
				temp++;
			}
		}

		if (temp > 0) {
			System.out.print("Element is present");

		} else {
			System.out.print("Element is not present");
		}
	}

}
