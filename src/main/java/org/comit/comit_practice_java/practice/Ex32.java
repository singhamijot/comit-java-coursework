package org.comit.comit_practice_java.practice;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		boolean found = false;
		for (int i=0; i < array.length; i++)
		{
			if(array[i]==30) {
				found = true;
			}
		}
		
		if(found == true) {
			System.out.println(" number found ");
			
		}
		else
		{
			System.out.println("Number not found");
		}
	}

}
