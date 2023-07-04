package org.comit.comit_practice_java.practice;

public class Ex46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="azzlea";
		int i = str.indexOf('z');
		boolean happy = false;
		if( str.charAt(i-1)== 'z')
		{
			happy = true;
		}
		if( str.charAt(i+1)== 'z')
		{
			happy = true;
		}
		
		System.out.println(happy);
	}

}
