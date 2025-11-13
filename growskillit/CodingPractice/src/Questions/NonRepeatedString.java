package Questions;

public class NonRepeatedString {

	public static void main(String[] args) {
		
		String s = "Successu";
		s = s.toLowerCase();
		for(char c : s.toCharArray()) {
			
			if(s.indexOf(c)== s.lastIndexOf(c))
			{
				System.out.println(c);
				break;
			}
			
		}
		
	
	}
		}
