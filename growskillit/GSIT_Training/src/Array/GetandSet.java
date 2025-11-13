package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetandSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String> ();
		
		l.add("Bhavi");
		l.add("Maths");
		l.add("Marks");
		l.add("l00");
		System.out.println(l.get(3));
		l.set(3, "Excellent");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}
	

}
