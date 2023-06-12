package org.comit.comit_practice_java.practice;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 48;
		int b = 12;
		int c = 37;
 int greatest = 0;
		
		if ( a>b && a>c) { // We check if "b" is bigger than the greatest.
			greatest = a;
		}
		
		else if (b>a && b>c) {// We check if "c" is bigger than the greatest.
			greatest = b;
		}
		else {greatest = c;}
		
		System.out.println("The greatest number is: " + greatest);
		
	}

}
