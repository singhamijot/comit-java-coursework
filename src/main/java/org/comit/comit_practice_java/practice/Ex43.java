package org.comit.comit_practice_java.practice;

public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love coding in Java";
		String reversed = "";
		for(int i=str.length()-1 ; i > -1; i--)
		{
			reversed = reversed + str.charAt(i);
		}
	
		System.out.println(reversed);
	}

}
