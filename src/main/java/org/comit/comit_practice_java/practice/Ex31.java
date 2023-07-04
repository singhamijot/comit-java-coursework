package org.comit.comit_practice_java.practice;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		int sum = 0;
		for (int i=0; i<array.length; i++)
		{
			sum+=array[i];
		}
		
		double avg = sum/(double)array.length;
		
	System.out.println("THe average is : "+avg);
	
	}

}
