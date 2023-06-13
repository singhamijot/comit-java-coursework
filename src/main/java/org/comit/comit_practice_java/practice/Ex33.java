package org.comit.comit_practice_java.practice;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		Integer index = null;
		for(int i=0; i < array.length;i++)
		{
			if (array[i] == 4 ) {
				index = i;
			}
		}
		System.out.println("The index of 4 is : "+index);
	}

}
