package org.comit.comit_practice_java.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = scan.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = scan.nextInt();
		
		scan.close();
		
		if(num1>num2) {
			System.out.println("num1 is bigger");
		}
		else {
			 System.out.println("Num2 bigger") ;
		}
	}

}
