package org.comit.comit_practice_java.practice;

class Book{
	String title;
	String author;
	double ISBN;
	
	Book(String t, String a, double i)
	{
		this.title=t;
		this.author=a;
		this.ISBN=i;
	}
	void display()
	{
		System.out.println("Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + "]");
		
	}
	
}

public class Ex51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] array = new Book[3];
		
		Book b1=new Book("Title1","Author1",12345);
		Book b2=new Book("Title2","Author2",11445);
		Book b3=new Book("Title3","Author3",19855);
		
		array[0]=b1;
		array[1]=b2;
		array[2]=b3;
		
		for(Book book : array)
		{
			book.display();
		}
		
		
		

	}

}
