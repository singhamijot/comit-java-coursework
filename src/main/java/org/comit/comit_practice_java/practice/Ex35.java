package org.comit.comit_practice_java.practice;

import java.util.Arrays;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int[] temp = new int[array.length];
		int i,j = 0;
		for(i=0; i < array.length ; i++)
		{
			temp[array.length - i -1] = array[i];
		}
		
		System.out.println("The reversed array is "+ Arrays.toString(temp));
	}

}
