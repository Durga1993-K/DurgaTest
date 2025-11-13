package java_program;

public class SumOfPairs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,5,7,11,9,13,8,12,6};
		int sum = 20;
		
		for (int i =0; i<arr.length;i++)//22,33,44,11
		{
			for(int j=i+1 ; j<arr.length; j++)
			{
				if(arr[i] + arr[j] == sum)
				
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
	}

}
