 package java_program2;

import java.util.Scanner;

public class Factorial_Number {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int f =1;
//		while(num >=1) {
//			f=f*num;
//			num--;
//		}
		for(int i =num ; i>=1 ; i--)
		{
			f=f*i;
		}
		System.out.println("factorial of num is :" +f);
	}

}
