package java_program2;

import java.util.Scanner;

public class Palindrone_number {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int rem; int sum =0;
		int temp = num;
		
		while(num > 0)
		{
			rem = num%10;
			sum =sum*10+rem;
			num=num/10;
			
		}
		System.out.println("Reverse num" + sum);
		if(sum == temp)
		{
			System.out.println("It is a palindrone number :" );
			
		}
		else
		{
			System.out.println("It is not a palindrone number :" );
		}
	}

}
