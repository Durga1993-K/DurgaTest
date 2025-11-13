package java_program;

public class Countevnodd {
	public static void main(String[] args) {
	
		 int[] arr = {34,56,36,12,77,87,92,44};
		 
		 int even =0;
		 int odd = 0;
		 
		 for(int i=0; i<=arr.length-1;i++)
		 {
			 if(arr[i]%2 == 0)
				 
			 {
				 even++;
			 }
			 else
			 {
				 odd++;
			 }
			
		 }
		 System.out.println(even);
		 System.out.println(odd); 
	}

}
