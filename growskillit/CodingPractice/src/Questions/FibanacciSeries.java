package Questions;

import java.util.Scanner;

public class FibanacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int N = sc.nextInt();

		int a = 0;
		int b = 1;
		System.out.println("Fibonacci series: ");
		for (int i = 0; i < N; i++)

		{
			System.out.print(a);
			int next = a + b;
			a = b;
			b = next;
		}
		sc.close();
	}

}
