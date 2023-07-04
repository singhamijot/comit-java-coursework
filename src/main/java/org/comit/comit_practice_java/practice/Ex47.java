package org.comit.comit_practice_java.practice;


class Person{
	
	String name;
	int age;
	
	Person(String s, int a)
	{
		this.name = s;
		this.age =a;
	}
	void display()
	{
		System.out.println("THe name is "+name+" and age : "+age);
	}
}
public class Ex47 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("John",25);
		Person p2 = new Person("Mark",35);
		
		p1.display();
		p2.display();
		
		
	}

}
