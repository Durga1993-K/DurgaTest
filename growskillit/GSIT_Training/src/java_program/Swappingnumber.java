package java_program;

import java.util.Scanner;

public class Swappingnumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of a ");
		int a = sc.nextInt();	// TODO Auto-generated method stub
		
	
		System.out.println("enter the number of b ");
		int b = sc.nextInt();
		
		System.out.println("Before swapping a = "+a+  " and b = " +b);
		int temp;
		temp=a ;
		a=b;
		b=temp;
		
		//without using 3rd vairable
		
//		a=a+b;
//		b=a-b;
//		a=a-b;

		System.out.println("After swapping a = "+a+  " and b = " +b);
		

}
}
