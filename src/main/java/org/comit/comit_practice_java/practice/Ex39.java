package org.comit.comit_practice_java.practice;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love coding in Java";
		int sum = 0;
		for(int i=0; i < str.length(); i++)
		{
			sum = sum+ str.charAt(i);
		}
		
		System.out.println("Sum of ASCII codes of str :"+sum);
	}

}
