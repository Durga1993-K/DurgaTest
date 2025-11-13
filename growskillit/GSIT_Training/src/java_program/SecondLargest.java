package java_program;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,7,11,9,13,8,12,6};
//	
//	for (int i =0; i<arr.length; i++)//22,33,44,11
//	{
//		for(int j=i+1 ; j<arr.length; j++)
//		{
//			if(arr[i]>arr[j])
//			{
//				int temp = arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//	}
		
	Arrays.sort(arr);
	System.out.println(arr[1]);
	
	}
	

}
