package org.comit.comit_practice_java.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter the number :");
		int a = scan.nextInt();
		scan.close();
		if(a>0)
		{
			System.out.println("" + a + " is positive number");
			
		}else
		{
			System.out.println(""+a + " is negative number");
		}
		
	}

}
