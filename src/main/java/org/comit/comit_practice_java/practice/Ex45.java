package org.comit.comit_practice_java.practice;

public class Ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love coding in Java";
		for(int i=0; i< str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				continue;
			}
			for(int j=i+1; j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.printf(" Char %c found at index %d \n",str.charAt(j), i);
				}
			}
		}
	}

}
