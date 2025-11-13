package java_program;

import java.util.Scanner;

public class FibanaaciSeries {
	public static void main(String[] args) {

	Scanner sc =new Scanner(System.in);
	System.out.print("enter the count");
	int count = sc.nextInt();
	
	int n1=1; int n2 =1;
	System.out.print("Fibanacci series" + n1 +"," +n2 + " ,");
	
	int sum = 0;
	
	for(int i=1; i<= count ; i++ )
	{
		sum =n1+n2;
		n1=n2;
		n2=sum;
		
	}
	System.out.println("Fibannaci series is : " +sum);
}
}