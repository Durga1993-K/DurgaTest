package Questions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacterinString {
	public static void main(String[] args) {
		String str = "jaffa";
		Set<Character> Seen = new HashSet<Character>();
		Set<Character> Duplicate = new HashSet<Character>();
		for(char c : str.toCharArray())
		{
			if(!Seen.add(c))
			{
				Duplicate.add(c);
			}
		}
		
		System.out.println(Duplicate);
	}
}
