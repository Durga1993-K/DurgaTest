package Questions;

public class ReverseStringWHiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String input = "I am a Tester";
			char[] inputArr = input.toCharArray();
			char[] Result = new char[inputArr.length];//creating the array as same length
			
			for(int i = 0 ; i< inputArr.length; i++)
			{
				if(inputArr[i] == ' ')
				{
					Result[i] = ' ';
				}
			}
			
			int j = inputArr.length-1;
			for(int i = 0 ; i< inputArr.length ; i++)
			{
				 if (inputArr[i] != ' ') {
				        // Move j backward to skip spaces
				        while (j >= 0 && Result[j] == ' ') {
				            j--;
				        }
				        Result[j] = inputArr[i];
				        j--;
			}
			
	}
			System.out.println("Reversed String is : " + " " + String.valueOf(Result));
	}
}
