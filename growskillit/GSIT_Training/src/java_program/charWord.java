package java_program;

public class charWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "kalyani";
		int count = 0;
		
		for(int i =0; i<=name.length()-1;i++)
		{
				char ch = name.charAt(i); 
			if(ch == 'a')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
