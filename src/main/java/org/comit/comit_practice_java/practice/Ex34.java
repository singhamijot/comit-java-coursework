package org.comit.comit_practice_java.practice;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		int max = array[0];
		int min = array[0];
		for (int i=0; i<array.length;i++)
		{
			if ( array[i]> max) {
				max = array[i];
			}
			
			if (min > array [i])
			{
				min = array[i];
			}
		}
		
		System.out.println(" THe Max number is : "+ max );
		System.out.println(" THe Min number is : "+ min );
	}

}
