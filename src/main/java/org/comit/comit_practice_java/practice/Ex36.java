package org.comit.comit_practice_java.practice;

public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		int even = 0,odd = 0;
		for(int i=0;i<array.length;i++)
		{
			if(i%2==0)
			{
				even+=1;
				
			}
			else
			{
				odd+=1;
			}
		}
		
		System.out.println("Total number of even ="+even+" and Odd = "+odd);
		
	}

}
