package Array;

public class ArrayIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {22,33,65,4};
		for (int i =0; i<=arr.length-1;i++)//22,33,44,11
		{
			for(int j=i+1 ; j<=arr.length-1; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];//arr is blank
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Sorted Array is : ");
		
		for(int data : arr)
		{
			data = data+1;
			System.out.print(data + " ");
		}
	}

}
