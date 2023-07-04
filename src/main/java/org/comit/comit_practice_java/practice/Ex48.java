package org.comit.comit_practice_java.practice;

class Dog{
	
	String name;
	String breed;
	
	Dog(String s, String b)
	{
		this.name = s;
		this.breed = b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}
	
	
	
	
}

public class Ex48 {
	public static void main(String[] args)
	{
		Dog d1 = new Dog("Tommy","Breed1");
		Dog d2 = new Dog("Ketchup","Breed2");
		
		d1.setBreed("Bulldog");
		d2.setBreed("Labrador");
		
		System.out.println(d1);
		System.out.println(d2);
		
		
		
		
	}

}
