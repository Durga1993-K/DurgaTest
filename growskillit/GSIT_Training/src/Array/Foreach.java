package Array;

public class Foreach {
	public static void main(String[] args) {
		
		int[] age = {22,33,45,67,89};
		
		int sum = 0;
		
		for(int data :age)
		{
			sum=sum+data;
				
		}
		
		System.out.println(sum +"");
		int avg = sum/age.length;
		System.out.print(avg);
	}
	
	
	

}
