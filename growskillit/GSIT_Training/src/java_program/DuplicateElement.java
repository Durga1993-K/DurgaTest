package java_program;

import java.util.Scanner;

public class DuplicateElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		
		int size =sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the array");
		
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is");
		for(int data : arr)
		{
			System.out.print(data + " ");
		}
		
		System.out.println("Sorted Array is");
		
		for (int i =0; i<size;i++)//22,33,44,22
		{
			for(int j=i+1 ; j<size; j++)
			{
				if(arr[i]==arr[j])
				{

					System.out.println("The duplicate element is +" + arr[i]);
				}
			}
		}

		
	}

}
