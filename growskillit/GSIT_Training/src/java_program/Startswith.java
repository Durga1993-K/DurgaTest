package java_program;

public class Startswith {
	public static void main(String[] args) {
		
		String[] arr = {"Vasu", "Kanna", "Bhavi","Harvin"};
		System.out.println(arr.length);
		
		for(int i =0;  i<arr.length; i++)
		{
			if(arr[i].contains("n"))
			{
			System.out.println(arr[i]);
			}
		}
		}

}
