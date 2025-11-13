package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Al_Console {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

	//	System.out.println("Size");

		int size = sc.nextInt();

		for (int i = 0; i <size; i++) {

			String val = sc.next();
			l.add(val);
		}
		System.out.println(l);
	}
}
