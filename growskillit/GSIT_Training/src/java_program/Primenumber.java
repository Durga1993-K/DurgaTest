package java_program;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int temp =0 ;
		
		for (int i =2 ; i<num-1 ; i++)
		{
			if(num%i==0)
			{
				temp = temp +1;//(if it divisble by zero the temp values increases)
			}
		}
		
			if(temp == 0)
			{
				System.out.println("It is a prime number");
			}
			else
			{

				System.out.println("It is not a prime number");
			}

	}

}
