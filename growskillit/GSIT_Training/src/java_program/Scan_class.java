package java_program;

import java.util.Scanner;

public class Scan_class {
	 public static void main (String[] args) 
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vale a : ");
		int a= sc.nextInt();
		
		System.out.println("Enter vale b : ");
		int b= sc.nextInt();
		
		System.out.println("Enter vale c : ");
		int c= sc.nextInt();
		
		System.out.println("Addition of a,b and c " +(a+b+c));
		sc.close();

	 }

	

}
