package org.comit.comit_practice_java.practice;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2012;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("It is a leap year");
				}
			}
		}
		else
		{
			System.out.println("It is not a leap year");
		}

	}

}
