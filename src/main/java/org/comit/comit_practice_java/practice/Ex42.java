package org.comit.comit_practice_java.practice;

public class Ex42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog.";
		int[] array = new int[str.length()];
		for(int i=0;i< str.length(); i++)
		{
			int k = str.charAt(i);
			array[i]= k;
		}
		
		for(int j=0; j< array.length; j++) {
		System.out.printf(" %c  : %d \n", str.charAt(j),array[j]);
		}
	}

}
