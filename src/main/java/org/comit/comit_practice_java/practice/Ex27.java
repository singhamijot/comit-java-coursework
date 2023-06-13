package org.comit.comit_practice_java.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double exRate = 0.75;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter amount in CAD :");
		double cad = scan.nextDouble();
		scan.close();
		
		System.out.println("In USD :"+ (cad*exRate));
	}

}
