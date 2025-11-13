package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AR_Foreach {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Kalyani");
		l.add("Bhavi");
		l.add("100");

			

	//	System.out.println(l);
		for (String ref : l) {
			System.out.println(ref);
		}
	}
}
