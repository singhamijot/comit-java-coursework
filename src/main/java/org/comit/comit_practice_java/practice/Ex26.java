package org.comit.comit_practice_java.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number ");
		int num = scan.nextInt();
		scan.close();
		
		for(int i=num;i<(num+100);i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
